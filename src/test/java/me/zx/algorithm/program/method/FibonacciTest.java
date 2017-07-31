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
package me.zx.algorithm.program.method;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 测试斐波纳契数列.
 * @author zhangxin
 * @since 0.0.1
 */
public class FibonacciTest {
    private Fibonacci1 fibonacci1;

    @Before
    public void before() {
        fibonacci1 = new Fibonacci1();
    }

    @Test
    public void test() {
        int n = 47;
        int expected = 1836311903;
        Assert.assertEquals("方法返回值错误", expected, fibonacci1.fibonacci(n));
    }

    @After
    public void after() {
        fibonacci1 = null;
    }
}
