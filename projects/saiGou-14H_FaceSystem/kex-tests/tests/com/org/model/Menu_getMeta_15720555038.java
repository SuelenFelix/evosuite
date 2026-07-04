package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Menu_getMeta_15720555038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45425;

    public Menu_getMeta_15720555038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45426 = new Integer(990725836);
        Integer term45452 = new Integer(-1231785501);
        Integer term45481 = new Integer(-2112346885);
        Integer term45485 = new Integer(-26311618);
        ArrayList term45489 = new ArrayList();
        ((ArrayList) term45489).add((Object)null);
        ((ArrayList) term45489).add((Object)null);
        ((ArrayList) term45489).add((Object)null);
        ((ArrayList) term45489).add((Object)null);
        ((ArrayList) term45489).add((Object)null);
        ((ArrayList) term45489).add((Object)null);
        Object term45480 = newInstance(Class.forName("com.org.model.Menu"));
        Object term45492 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term45480, term45480.getClass(), "id", term45481);
        setField(term45480, term45480.getClass(), "name", "");
        setField(term45480, term45480.getClass(), "path", "");
        setField(term45480, term45480.getClass(), "parentId", term45485);
        setField(term45480, term45480.getClass(), "icon", "");
        setField(term45480, term45480.getClass(), "introduce", "");
        setField(term45480, term45480.getClass(), "children", term45489);
        setField(term45492, term45492.getClass(), "title", null);
        setField(term45492, term45492.getClass(), "icon", null);
        setField(term45480, term45480.getClass(), "meta", term45492);
        Integer term45494 = new Integer(1394978641);
        Integer term45498 = new Integer(1085224973);
        ArrayList term45502 = new ArrayList();
        ((ArrayList) term45502).add((Object)null);
        Object term45493 = newInstance(Class.forName("com.org.model.Menu"));
        Object term45505 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term45493, term45493.getClass(), "id", term45494);
        setField(term45493, term45493.getClass(), "name", "");
        setField(term45493, term45493.getClass(), "path", "");
        setField(term45493, term45493.getClass(), "parentId", term45498);
        setField(term45493, term45493.getClass(), "icon", "");
        setField(term45493, term45493.getClass(), "introduce", "");
        setField(term45493, term45493.getClass(), "children", term45502);
        setField(term45505, term45505.getClass(), "title", null);
        setField(term45505, term45505.getClass(), "icon", null);
        setField(term45493, term45493.getClass(), "meta", term45505);
        Integer term45507 = new Integer(-798151545);
        Integer term45511 = new Integer(-243386399);
        ArrayList term45515 = new ArrayList();
        ((ArrayList) term45515).add((Object)null);
        ((ArrayList) term45515).add((Object)null);
        ((ArrayList) term45515).add((Object)null);
        ((ArrayList) term45515).add((Object)null);
        ((ArrayList) term45515).add((Object)null);
        Object term45506 = newInstance(Class.forName("com.org.model.Menu"));
        Object term45518 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term45506, term45506.getClass(), "id", term45507);
        setField(term45506, term45506.getClass(), "name", "");
        setField(term45506, term45506.getClass(), "path", "");
        setField(term45506, term45506.getClass(), "parentId", term45511);
        setField(term45506, term45506.getClass(), "icon", "");
        setField(term45506, term45506.getClass(), "introduce", "");
        setField(term45506, term45506.getClass(), "children", term45515);
        setField(term45518, term45518.getClass(), "title", null);
        setField(term45518, term45518.getClass(), "icon", null);
        setField(term45506, term45506.getClass(), "meta", term45518);
        ArrayList term45478 = new ArrayList();
        ((ArrayList) term45478).add(term45480);
        ((ArrayList) term45478).add(term45493);
        ((ArrayList) term45478).add(term45480);
        ((ArrayList) term45478).add(term45506);
        ((ArrayList) term45478).add(term45493);
        ((ArrayList) term45478).add(term45493);
        term45425 = newInstance(Class.forName("com.org.model.Menu"));
        Object term45521 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term45425, term45425.getClass(), "id", term45426);
        setField(term45425, term45425.getClass(), "name", "HAIIDZPgWO");
        setField(term45425, term45425.getClass(), "path", "QCiBNYigbL");
        setField(term45425, term45425.getClass(), "parentId", term45452);
        setField(term45425, term45425.getClass(), "icon", "LScaKHxibg");
        setField(term45425, term45425.getClass(), "introduce", "fvfdRBdhmi");
        setField(term45425, term45425.getClass(), "children", term45478);
        setField(term45521, term45521.getClass(), "title", "iQmKOOQWso");
        setField(term45521, term45521.getClass(), "icon", "RMTdyrwCqF");
        setField(term45425, term45425.getClass(), "meta", term45521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeta", argTypes, term45425, args);
    }

};


