package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class RouterVO_setPath_13033236829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1429;

    public RouterVO_setPath_13033236829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1454 = new Boolean(false);
        Boolean term1510 = new Boolean(false);
        ArrayList term1515 = new ArrayList();
        ((ArrayList) term1515).add((Object)null);
        ((ArrayList) term1515).add((Object)null);
        ((ArrayList) term1515).add((Object)null);
        ((ArrayList) term1515).add((Object)null);
        ((ArrayList) term1515).add((Object)null);
        Object term1507 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1514 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1507, term1507.getClass(), "name", "");
        setField(term1507, term1507.getClass(), "path", "");
        setField(term1507, term1507.getClass(), "hidden", term1510);
        setField(term1507, term1507.getClass(), "redirect", "");
        setField(term1507, term1507.getClass(), "component", "");
        setField(term1514, term1514.getClass(), "title", null);
        setField(term1514, term1514.getClass(), "icon", null);
        setField(term1507, term1507.getClass(), "meta", term1514);
        setField(term1507, term1507.getClass(), "children", term1515);
        Boolean term1521 = new Boolean(false);
        ArrayList term1526 = new ArrayList();
        ((ArrayList) term1526).add((Object)null);
        ((ArrayList) term1526).add((Object)null);
        ((ArrayList) term1526).add((Object)null);
        ((ArrayList) term1526).add((Object)null);
        ((ArrayList) term1526).add((Object)null);
        ((ArrayList) term1526).add((Object)null);
        Object term1518 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1525 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1518, term1518.getClass(), "name", "");
        setField(term1518, term1518.getClass(), "path", "");
        setField(term1518, term1518.getClass(), "hidden", term1521);
        setField(term1518, term1518.getClass(), "redirect", "");
        setField(term1518, term1518.getClass(), "component", "");
        setField(term1525, term1525.getClass(), "title", null);
        setField(term1525, term1525.getClass(), "icon", null);
        setField(term1518, term1518.getClass(), "meta", term1525);
        setField(term1518, term1518.getClass(), "children", term1526);
        Boolean term1532 = new Boolean(true);
        ArrayList term1537 = new ArrayList();
        Object term1529 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1536 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1529, term1529.getClass(), "name", "");
        setField(term1529, term1529.getClass(), "path", "");
        setField(term1529, term1529.getClass(), "hidden", term1532);
        setField(term1529, term1529.getClass(), "redirect", "");
        setField(term1529, term1529.getClass(), "component", "");
        setField(term1536, term1536.getClass(), "title", null);
        setField(term1536, term1536.getClass(), "icon", null);
        setField(term1529, term1529.getClass(), "meta", term1536);
        setField(term1529, term1529.getClass(), "children", term1537);
        Boolean term1543 = new Boolean(false);
        ArrayList term1548 = new ArrayList();
        ((ArrayList) term1548).add((Object)null);
        ((ArrayList) term1548).add((Object)null);
        ((ArrayList) term1548).add((Object)null);
        ((ArrayList) term1548).add((Object)null);
        ((ArrayList) term1548).add((Object)null);
        ((ArrayList) term1548).add((Object)null);
        ((ArrayList) term1548).add((Object)null);
        Object term1540 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1547 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1540, term1540.getClass(), "name", "");
        setField(term1540, term1540.getClass(), "path", "");
        setField(term1540, term1540.getClass(), "hidden", term1543);
        setField(term1540, term1540.getClass(), "redirect", "");
        setField(term1540, term1540.getClass(), "component", "");
        setField(term1547, term1547.getClass(), "title", null);
        setField(term1547, term1547.getClass(), "icon", null);
        setField(term1540, term1540.getClass(), "meta", term1547);
        setField(term1540, term1540.getClass(), "children", term1548);
        Boolean term1554 = new Boolean(false);
        ArrayList term1559 = new ArrayList();
        ((ArrayList) term1559).add((Object)null);
        Object term1551 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1558 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1551, term1551.getClass(), "name", "");
        setField(term1551, term1551.getClass(), "path", "");
        setField(term1551, term1551.getClass(), "hidden", term1554);
        setField(term1551, term1551.getClass(), "redirect", "");
        setField(term1551, term1551.getClass(), "component", "");
        setField(term1558, term1558.getClass(), "title", null);
        setField(term1558, term1558.getClass(), "icon", null);
        setField(term1551, term1551.getClass(), "meta", term1558);
        setField(term1551, term1551.getClass(), "children", term1559);
        ArrayList term1505 = new ArrayList();
        ((ArrayList) term1505).add(term1507);
        ((ArrayList) term1505).add(term1518);
        ((ArrayList) term1505).add(term1529);
        ((ArrayList) term1505).add(term1540);
        ((ArrayList) term1505).add(term1551);
        ((ArrayList) term1505).add(term1518);
        term1429 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1480 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1429, term1429.getClass(), "name", "SScVQYSvWH");
        setField(term1429, term1429.getClass(), "path", "MnovcqFhCl");
        setField(term1429, term1429.getClass(), "hidden", term1454);
        setField(term1429, term1429.getClass(), "redirect", "qYtAeLzOhW");
        setField(term1429, term1429.getClass(), "component", "tJzmOfcUnY");
        setField(term1480, term1480.getClass(), "title", "TKlccZUpjz");
        setField(term1480, term1480.getClass(), "icon", "GGzwMoHZXC");
        setField(term1429, term1429.getClass(), "meta", term1480);
        setField(term1429, term1429.getClass(), "children", term1505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bwlLFAfNWx";
        callMethod(klass, "setPath", argTypes, term1429, args);
    }

};


