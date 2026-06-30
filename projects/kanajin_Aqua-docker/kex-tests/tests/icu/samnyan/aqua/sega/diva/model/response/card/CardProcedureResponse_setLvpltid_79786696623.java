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
import java.lang.Integer;

public class CardProcedureResponse_setLvpltid_79786696623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16995;
     Object term17091;

    public CardProcedureResponse_setLvpltid_79786696623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17094 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term17093 = ((Class) term17094).getDeclaredField((String) "SUCCESS");
        ((Field) term17093).setAccessible(true);
        Object enum51 = ((Field) term17093).get((Object) null);
        Integer term17023 = new Integer(1141317871);
        Integer term17025 = new Integer(890669485);
        Integer term17039 = new Integer(691577392);
        Integer term17041 = new Integer(-893623680);
        Integer term17043 = new Integer(-1963434938);
        Class<? extends Object> term17372 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term17371 = ((Class) term17372).getDeclaredField((String) "RESET");
        ((Field) term17371).setAccessible(true);
        Object enum52 = ((Field) term17371).get((Object) null);
        term16995 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term16995, term16995.getClass(), "cd_adm_result", enum51);
        setIntField(term16995, term16995.getClass(), "chg_name_price", 1551099402);
        setIntField(term16995, term16995.getClass(), "accept_idx", -2027534003);
        setIntField(term16995, term16995.getClass(), "pd_id", 1063420942);
        setField(term16995, term16995.getClass(), "player_name", "OJJtVNPyKZ");
        setField(term16995, term16995.getClass(), "lv_num", term17023);
        setField(term16995, term16995.getClass(), "lv_pnt", term17025);
        setField(term16995, term16995.getClass(), "lv_str", "AKNapTAfmD");
        setField(term16995, term16995.getClass(), "lv_efct_id", term17039);
        setField(term16995, term16995.getClass(), "lv_plt_id", term17041);
        setField(term16995, term16995.getClass(), "vcld_pts", term17043);
        setField(term16995, term16995.getClass(), "passwd_stat", enum52);
        setField(term16995, term16995.getClass(), "cmd", "xJgPlLxpgC");
        setField(term16995, term16995.getClass(), "req_id", "EYtfuJaxiM");
        setField(term16995, term16995.getClass(), "stat", "gCWtLVKVVe");
        term17091 = new Integer(906181092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term17091;
        callMethod(klass, "setLv_plt_id", argTypes, term16995, args);
    }

};


