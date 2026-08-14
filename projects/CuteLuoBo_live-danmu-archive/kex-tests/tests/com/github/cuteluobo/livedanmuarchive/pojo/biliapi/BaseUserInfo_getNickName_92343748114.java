package com.github.cuteluobo.livedanmuarchive.pojo.biliapi;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.biliapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BaseUserInfo_getNickName_92343748114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15555;

    public BaseUserInfo_getNickName_92343748114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15555 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term15555, term15555.getClass(), "uid", 6853972830905120647L);
        setBooleanField(term15555, term15555.getClass(), "login", false);
        setIntField(term15555, term15555.getClass(), "level", -1695750603);
        setField(term15555, term15555.getClass(), "nickName", "NTefzwLPhx");
        setField(term15555, term15555.getClass(), "imgKey", "dirFuhqyNu");
        setField(term15555, term15555.getClass(), "subKey", "YVLRenzuoR");
        setField(term15555, term15555.getClass(), "cookie", "JukEMhPWql");
        setField(term15555, term15555.getClass(), "accessKey", "ZdNcodHERG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNickName", argTypes, term15555, args);
    }

};


