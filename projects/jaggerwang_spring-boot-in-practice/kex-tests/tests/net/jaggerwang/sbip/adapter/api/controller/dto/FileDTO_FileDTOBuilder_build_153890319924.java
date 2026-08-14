package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FileDTO_FileDTOBuilder_build_153890319924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57920;

    public FileDTO_FileDTOBuilder_build_153890319924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57920 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        setField(term57920, term57920.getClass(), "id", null);
        setField(term57920, term57920.getClass(), "userId", null);
        setField(term57920, term57920.getClass(), "region", null);
        setField(term57920, term57920.getClass(), "bucket", null);
        setField(term57920, term57920.getClass(), "path", null);
        setField(term57920, term57920.getClass(), "meta", null);
        setField(term57920, term57920.getClass(), "createdAt", null);
        setField(term57920, term57920.getClass(), "updatedAt", null);
        setField(term57920, term57920.getClass(), "url", null);
        setField(term57920, term57920.getClass(), "thumbs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term57920, args);
    }

};


