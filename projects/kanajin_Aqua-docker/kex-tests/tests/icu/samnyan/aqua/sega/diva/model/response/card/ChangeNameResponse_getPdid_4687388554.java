package icu.samnyan.aqua.sega.diva.model.response.card;

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
import static icu.samnyan.aqua.sega.diva.model.response.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ChangeNameResponse_getPdid_4687388554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20801;

    public ChangeNameResponse_getPdid_4687388554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20865 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term20864 = ((Class) term20865).getDeclaredField((String) "SUCCESS");
        ((Field) term20864).setAccessible(true);
        Object enum62 = ((Field) term20864).get((Object) null);
        term20801 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse"));
        setField(term20801, term20801.getClass(), "cd_adm_result", enum62);
        setIntField(term20801, term20801.getClass(), "accept_idx", -1772434990);
        setIntField(term20801, term20801.getClass(), "pd_id", -1845499264);
        setField(term20801, term20801.getClass(), "player_name", "VeDtgDzGAN");
        setField(term20801, term20801.getClass(), "cmd", "aWYOWZFyaX");
        setField(term20801, term20801.getClass(), "req_id", "BRIVNtfUWU");
        setField(term20801, term20801.getClass(), "stat", "DbiCVtPPCT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term20801, args);
    }

};


