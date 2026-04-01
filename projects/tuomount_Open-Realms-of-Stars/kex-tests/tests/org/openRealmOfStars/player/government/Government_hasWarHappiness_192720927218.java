package org.openRealmOfStars.player.government;

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
import static org.openRealmOfStars.player.government.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Government_hasWarHappiness_192720927218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13477;

    public Government_hasWarHappiness_192720927218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13596 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term13595 = ((Class) term13596).getDeclaredField((String) "CEO_AS_A_RULER");
        ((Field) term13595).setAccessible(true);
        Object enum26 = ((Field) term13595).get((Object) null);
        ArrayList term13551 = new ArrayList();
        ((ArrayList) term13551).add((Object)null);
        ((ArrayList) term13551).add((Object)null);
        ((ArrayList) term13551).add((Object)null);
        ((ArrayList) term13551).add((Object)null);
        ((ArrayList) term13551).add((Object)null);
        Object term13546 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term13546, term13546.getClass(), "traitId", "");
        setField(term13546, term13546.getClass(), "traitName", "");
        setField(term13546, term13546.getClass(), "description", "");
        setField(term13546, term13546.getClass(), "group", "");
        setField(term13546, term13546.getClass(), "conflictsWithIds", term13551);
        setByteField(term13546, term13546.getClass(), "traitPoints", (byte) 65);
        ArrayList term13560 = new ArrayList();
        ((ArrayList) term13560).add((Object)null);
        ((ArrayList) term13560).add((Object)null);
        ((ArrayList) term13560).add((Object)null);
        ((ArrayList) term13560).add((Object)null);
        ((ArrayList) term13560).add((Object)null);
        ((ArrayList) term13560).add((Object)null);
        ((ArrayList) term13560).add((Object)null);
        ((ArrayList) term13560).add((Object)null);
        ((ArrayList) term13560).add((Object)null);
        Object term13555 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term13555, term13555.getClass(), "traitId", "");
        setField(term13555, term13555.getClass(), "traitName", "");
        setField(term13555, term13555.getClass(), "description", "");
        setField(term13555, term13555.getClass(), "group", "");
        setField(term13555, term13555.getClass(), "conflictsWithIds", term13560);
        setByteField(term13555, term13555.getClass(), "traitPoints", (byte) -44);
        ArrayList term13569 = new ArrayList();
        ((ArrayList) term13569).add((Object)null);
        ((ArrayList) term13569).add((Object)null);
        ((ArrayList) term13569).add((Object)null);
        ((ArrayList) term13569).add((Object)null);
        ((ArrayList) term13569).add((Object)null);
        ((ArrayList) term13569).add((Object)null);
        ((ArrayList) term13569).add((Object)null);
        ((ArrayList) term13569).add((Object)null);
        ((ArrayList) term13569).add((Object)null);
        Object term13564 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term13564, term13564.getClass(), "traitId", "");
        setField(term13564, term13564.getClass(), "traitName", "");
        setField(term13564, term13564.getClass(), "description", "");
        setField(term13564, term13564.getClass(), "group", "");
        setField(term13564, term13564.getClass(), "conflictsWithIds", term13569);
        setByteField(term13564, term13564.getClass(), "traitPoints", (byte) 33);
        ArrayList term13544 = new ArrayList();
        ((ArrayList) term13544).add(term13546);
        ((ArrayList) term13544).add(term13555);
        ((ArrayList) term13544).add(term13564);
        term13477 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term13477, term13477.getClass(), "id", "szGicGyWDL");
        setField(term13477, term13477.getClass(), "name", "lkdvUiYwRq");
        setField(term13477, term13477.getClass(), "rulerSelection", enum26);
        setField(term13477, term13477.getClass(), "rulerTitleMale", "XuxkPrpfND");
        setField(term13477, term13477.getClass(), "rulerTitleFemale", "OxNXeKMDje");
        setField(term13477, term13477.getClass(), "traits", term13544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasWarHappiness", argTypes, term13477, args);
    }

};


