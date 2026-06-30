package com.zxl.dailypractice.project.controller.resp;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.zxl.dailypractice.project.controller.resp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetDiaByImportFileResp_getSubresid_9636063092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;

    public GetDiaByImportFileResp_getSubresid_9636063092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.resp.GetDiaByImportFileResp"));
        setField(term46, term46.getClass(), "oltDevip", "MuLcgQHgqz");
        setField(term46, term46.getClass(), "subresid", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.resp.GetDiaByImportFileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubresid", argTypes, term46, args);
    }

};


