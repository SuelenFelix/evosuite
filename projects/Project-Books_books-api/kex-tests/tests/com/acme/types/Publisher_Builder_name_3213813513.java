package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class Publisher_Builder_name_3213813513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2238;

    public Publisher_Builder_name_3213813513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2271 = new Integer(158873461);
        ArrayList term2274 = new ArrayList();
        ((ArrayList) term2274).add((Object)null);
        ArrayList term2277 = new ArrayList();
        ((ArrayList) term2277).add((Object)null);
        ((ArrayList) term2277).add((Object)null);
        ((ArrayList) term2277).add((Object)null);
        ((ArrayList) term2277).add((Object)null);
        ((ArrayList) term2277).add((Object)null);
        ((ArrayList) term2277).add((Object)null);
        ArrayList term2283 = new ArrayList();
        ((ArrayList) term2283).add((Object)null);
        ((ArrayList) term2283).add((Object)null);
        ((ArrayList) term2283).add((Object)null);
        ((ArrayList) term2283).add((Object)null);
        ((ArrayList) term2283).add((Object)null);
        Object term2265 = newInstance(Class.forName("com.acme.types.Book"));
        Object term2270 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term2280 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term2281 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term2282 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term2265, term2265.getClass(), "id", "");
        setField(term2265, term2265.getClass(), "title", "");
        setField(term2265, term2265.getClass(), "isbn13", "");
        setField(term2265, term2265.getClass(), "isbn10", "");
        setField(term2270, term2270.getClass(), "id", null);
        setField(term2270, term2270.getClass(), "name", null);
        setField(term2265, term2265.getClass(), "genre", term2270);
        setField(term2265, term2265.getClass(), "yearOfPublication", term2271);
        setField(term2265, term2265.getClass(), "blurb", "");
        setField(term2265, term2265.getClass(), "authors", term2274);
        setField(term2265, term2265.getClass(), "publishers", term2277);
        setField(term2280, term2280.getClass(), "id", null);
        setField(term2280, term2280.getClass(), "name", null);
        setField(term2265, term2265.getClass(), "lang", term2280);
        setField(term2281, term2281.getClass(), "id", null);
        setField(term2281, term2281.getClass(), "formatName", null);
        setField(term2265, term2265.getClass(), "publishingFormat", term2281);
        setField(term2282, term2282.getClass(), "id", null);
        setField(term2282, term2282.getClass(), "smallUrl", null);
        setField(term2282, term2282.getClass(), "mediumUrl", null);
        setField(term2282, term2282.getClass(), "largeUrl", null);
        setField(term2265, term2265.getClass(), "cover", term2282);
        setField(term2265, term2265.getClass(), "awards", term2283);
        Integer term2292 = new Integer(98922530);
        ArrayList term2295 = new ArrayList();
        ((ArrayList) term2295).add((Object)null);
        ((ArrayList) term2295).add((Object)null);
        ((ArrayList) term2295).add((Object)null);
        ((ArrayList) term2295).add((Object)null);
        ArrayList term2298 = new ArrayList();
        ArrayList term2304 = new ArrayList();
        ((ArrayList) term2304).add((Object)null);
        Object term2286 = newInstance(Class.forName("com.acme.types.Book"));
        Object term2291 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term2301 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term2302 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term2303 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term2286, term2286.getClass(), "id", "");
        setField(term2286, term2286.getClass(), "title", "");
        setField(term2286, term2286.getClass(), "isbn13", "");
        setField(term2286, term2286.getClass(), "isbn10", "");
        setField(term2291, term2291.getClass(), "id", null);
        setField(term2291, term2291.getClass(), "name", null);
        setField(term2286, term2286.getClass(), "genre", term2291);
        setField(term2286, term2286.getClass(), "yearOfPublication", term2292);
        setField(term2286, term2286.getClass(), "blurb", "");
        setField(term2286, term2286.getClass(), "authors", term2295);
        setField(term2286, term2286.getClass(), "publishers", term2298);
        setField(term2301, term2301.getClass(), "id", null);
        setField(term2301, term2301.getClass(), "name", null);
        setField(term2286, term2286.getClass(), "lang", term2301);
        setField(term2302, term2302.getClass(), "id", null);
        setField(term2302, term2302.getClass(), "formatName", null);
        setField(term2286, term2286.getClass(), "publishingFormat", term2302);
        setField(term2303, term2303.getClass(), "id", null);
        setField(term2303, term2303.getClass(), "smallUrl", null);
        setField(term2303, term2303.getClass(), "mediumUrl", null);
        setField(term2303, term2303.getClass(), "largeUrl", null);
        setField(term2286, term2286.getClass(), "cover", term2303);
        setField(term2286, term2286.getClass(), "awards", term2304);
        Integer term2313 = new Integer(-1498296052);
        ArrayList term2316 = new ArrayList();
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        ((ArrayList) term2316).add((Object)null);
        ArrayList term2319 = new ArrayList();
        ((ArrayList) term2319).add((Object)null);
        ((ArrayList) term2319).add((Object)null);
        ((ArrayList) term2319).add((Object)null);
        ((ArrayList) term2319).add((Object)null);
        ArrayList term2325 = new ArrayList();
        ((ArrayList) term2325).add((Object)null);
        ((ArrayList) term2325).add((Object)null);
        ((ArrayList) term2325).add((Object)null);
        ((ArrayList) term2325).add((Object)null);
        ((ArrayList) term2325).add((Object)null);
        Object term2307 = newInstance(Class.forName("com.acme.types.Book"));
        Object term2312 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term2322 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term2323 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term2324 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term2307, term2307.getClass(), "id", "");
        setField(term2307, term2307.getClass(), "title", "");
        setField(term2307, term2307.getClass(), "isbn13", "");
        setField(term2307, term2307.getClass(), "isbn10", "");
        setField(term2312, term2312.getClass(), "id", null);
        setField(term2312, term2312.getClass(), "name", null);
        setField(term2307, term2307.getClass(), "genre", term2312);
        setField(term2307, term2307.getClass(), "yearOfPublication", term2313);
        setField(term2307, term2307.getClass(), "blurb", "");
        setField(term2307, term2307.getClass(), "authors", term2316);
        setField(term2307, term2307.getClass(), "publishers", term2319);
        setField(term2322, term2322.getClass(), "id", null);
        setField(term2322, term2322.getClass(), "name", null);
        setField(term2307, term2307.getClass(), "lang", term2322);
        setField(term2323, term2323.getClass(), "id", null);
        setField(term2323, term2323.getClass(), "formatName", null);
        setField(term2307, term2307.getClass(), "publishingFormat", term2323);
        setField(term2324, term2324.getClass(), "id", null);
        setField(term2324, term2324.getClass(), "smallUrl", null);
        setField(term2324, term2324.getClass(), "mediumUrl", null);
        setField(term2324, term2324.getClass(), "largeUrl", null);
        setField(term2307, term2307.getClass(), "cover", term2324);
        setField(term2307, term2307.getClass(), "awards", term2325);
        ArrayList term2263 = new ArrayList();
        ((ArrayList) term2263).add(term2265);
        ((ArrayList) term2263).add(term2286);
        ((ArrayList) term2263).add(term2307);
        ((ArrayList) term2263).add(term2307);
        term2238 = newInstance(Class.forName("com.acme.types.Publisher$Builder"));
        setField(term2238, term2238.getClass(), "id", "MnHKbTZBTr");
        setField(term2238, term2238.getClass(), "name", "xCNDHQZBKx");
        setField(term2238, term2238.getClass(), "books", term2263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Publisher$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VSmPzUiFzd";
        callMethod(klass, "name", argTypes, term2238, args);
    }

};


