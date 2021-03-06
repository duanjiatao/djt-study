package com.djt.tools.test;

import com.djt.tools.AbsTools;
import com.djt.tools.impl.HdfsTools;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 　djt317@qq.com
 * @since 　 2021-04-09
 */
public class ToolsTest {

    private static final Logger log = LogManager.getLogger(ToolsTest.class);

    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    @Test
    public void testHdfsTools() {
        AbsTools tools = new HdfsTools();
        tools.execute(null);
    }

}
