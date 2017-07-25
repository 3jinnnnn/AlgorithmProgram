/*
 * Copyright © 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.zx.algorithm.program;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileReader;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 测试逆序对算法.
 * 读文件网址http://www.iteye.com/news/31830
 * @author zhangxin
 * @since 0.0.1
 */
public class ReversePairsTest {
    private static final Logger LOGGER = Logger.getLogger("ReversePairsTest");
    private static final long EXPECTED_VALUE = 439694685;
    private static final long EXPECTED_USED_TIME = 10000;
    private ReversePairs1 reversePairs1;

    @Before
    public void before() {
        reversePairs1 = new ReversePairs1();
    }

    @Test
    public void test() {
        long startTime = System.currentTimeMillis();
        int[] array = {1, 2, 3 };
        try (FileReader reader = new FileReader(new File("/15.in"))) {
            char[] buffer = new char[1024];
            int charread = 0;
            while ((charread = reader.read(buffer)) != -1) {
                LOGGER.info(String.valueOf(buffer));
            }
        } catch (final Exception e) {
            LOGGER.info(e.getMessage());
        }
        long actualValue = reversePairs1.reversePairs(array);
        long usedTime = System.currentTimeMillis() - startTime;
        int timeout = Long.compare(EXPECTED_USED_TIME, usedTime);
        Assert.assertEquals("算法结果错误", EXPECTED_VALUE, actualValue);
        Assert.assertEquals("算法超时", 1, timeout);
    }

    @After
    public void after() {
        reversePairs1 = null;
    }

}
