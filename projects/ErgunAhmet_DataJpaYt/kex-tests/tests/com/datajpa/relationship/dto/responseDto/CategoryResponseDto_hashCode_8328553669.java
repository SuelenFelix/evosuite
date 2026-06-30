package com.datajpa.relationship.dto.responseDto;

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
import static com.datajpa.relationship.dto.responseDto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class CategoryResponseDto_hashCode_8328553669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1028;

    public CategoryResponseDto_hashCode_8328553669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1029 = new Long(6967924379644551255L);
        ArrayList term1043 = new ArrayList();
        ((ArrayList) term1043).add("LvtrsXUliU");
        ((ArrayList) term1043).add("xLbjWUgOIL");
        ((ArrayList) term1043).add("jDtqGUpnZN");
        ((ArrayList) term1043).add("nGKItKLYNC");
        ((ArrayList) term1043).add("UiUYnPrcCi");
        ((ArrayList) term1043).add("UoYtihxVaS");
        ((ArrayList) term1043).add("JDswTTCZHV");
        ((ArrayList) term1043).add("onpbIeEKoi");
        ((ArrayList) term1043).add("YRHGsAkhxb");
        term1028 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.CategoryResponseDto"));
        setField(term1028, term1028.getClass(), "id", term1029);
        setField(term1028, term1028.getClass(), "name", "tShwQLRGNe");
        setField(term1028, term1028.getClass(), "bookNames", term1043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.CategoryResponseDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1028, args);
    }

};


