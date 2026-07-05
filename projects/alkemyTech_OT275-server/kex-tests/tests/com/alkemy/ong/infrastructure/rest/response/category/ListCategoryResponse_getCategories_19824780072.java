package com.alkemy.ong.infrastructure.rest.response.category;

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
import static com.alkemy.ong.infrastructure.rest.response.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class ListCategoryResponse_getCategories_19824780072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;

    public ListCategoryResponse_getCategories_19824780072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term130 = new Long(7411271909051562686L);
        Object term129 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term129, term129.getClass(), "id", term130);
        setField(term129, term129.getClass(), "description", "");
        setField(term129, term129.getClass(), "imageUrl", "");
        setField(term129, term129.getClass(), "name", "");
        Long term136 = new Long(4872422362414183754L);
        Object term135 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term135, term135.getClass(), "id", term136);
        setField(term135, term135.getClass(), "description", "");
        setField(term135, term135.getClass(), "imageUrl", "");
        setField(term135, term135.getClass(), "name", "");
        Long term142 = new Long(6811161968424632369L);
        Object term141 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term141, term141.getClass(), "id", term142);
        setField(term141, term141.getClass(), "description", "");
        setField(term141, term141.getClass(), "imageUrl", "");
        setField(term141, term141.getClass(), "name", "");
        Long term148 = new Long(-7237588299778557629L);
        Object term147 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term147, term147.getClass(), "id", term148);
        setField(term147, term147.getClass(), "description", "");
        setField(term147, term147.getClass(), "imageUrl", "");
        setField(term147, term147.getClass(), "name", "");
        Long term154 = new Long(6967924379644551255L);
        Object term153 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term153, term153.getClass(), "id", term154);
        setField(term153, term153.getClass(), "description", "");
        setField(term153, term153.getClass(), "imageUrl", "");
        setField(term153, term153.getClass(), "name", "");
        Long term160 = new Long(-2813493605142626659L);
        Object term159 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term159, term159.getClass(), "id", term160);
        setField(term159, term159.getClass(), "description", "");
        setField(term159, term159.getClass(), "imageUrl", "");
        setField(term159, term159.getClass(), "name", "");
        Long term166 = new Long(-8885298608300233488L);
        Object term165 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term165, term165.getClass(), "id", term166);
        setField(term165, term165.getClass(), "description", "");
        setField(term165, term165.getClass(), "imageUrl", "");
        setField(term165, term165.getClass(), "name", "");
        Long term172 = new Long(-4325723315152823407L);
        Object term171 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term171, term171.getClass(), "id", term172);
        setField(term171, term171.getClass(), "description", "");
        setField(term171, term171.getClass(), "imageUrl", "");
        setField(term171, term171.getClass(), "name", "");
        Long term178 = new Long(2535595959091595249L);
        Object term177 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term177, term177.getClass(), "id", term178);
        setField(term177, term177.getClass(), "description", "");
        setField(term177, term177.getClass(), "imageUrl", "");
        setField(term177, term177.getClass(), "name", "");
        ArrayList term127 = new ArrayList();
        ((ArrayList) term127).add(term129);
        ((ArrayList) term127).add(term135);
        ((ArrayList) term127).add(term141);
        ((ArrayList) term127).add(term147);
        ((ArrayList) term127).add(term153);
        ((ArrayList) term127).add(term159);
        ((ArrayList) term127).add(term165);
        ((ArrayList) term127).add(term171);
        ((ArrayList) term127).add(term177);
        term126 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.ListCategoryResponse"));
        setField(term126, term126.getClass(), "categories", term127);
        setIntField(term126, term126.getClass(), "page", 568599855);
        setIntField(term126, term126.getClass(), "size", 1162663216);
        setIntField(term126, term126.getClass(), "totalPages", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.category.ListCategoryResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategories", argTypes, term126, args);
    }

};


