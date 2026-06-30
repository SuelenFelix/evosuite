package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PreStartResponse_setMdleqptm_122384047538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286348;
     Object term286502;

    public PreStartResponse_setMdleqptm_122384047538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term286513 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term286512 = ((Class) term286513).getDeclaredField((String) "SUCCESS");
        ((Field) term286512).setAccessible(true);
        Object enum691 = ((Field) term286512).get((Object) null);
        Integer term286361 = new Integer(1709474063);
        Integer term286363 = new Integer(1406617209);
        Integer term286365 = new Integer(1706047059);
        Integer term286367 = new Integer(590451710);
        Integer term286369 = new Integer(-1999787419);
        Class<? extends Object> term286821 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term286820 = ((Class) term286821).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term286820).setAccessible(true);
        Object enum692 = ((Field) term286820).get((Object) null);
        Integer term286400 = new Integer(-1224443634);
        Integer term286402 = new Integer(1048451946);
        Integer term286416 = new Integer(5603560);
        Integer term286418 = new Integer(-1079020032);
        Integer term286442 = new Integer(-1973791064);
        Integer term286444 = new Integer(-2072158633);
        Integer term286446 = new Integer(-355469363);
        Integer term286448 = new Integer(1465188553);
        Integer term286450 = new Integer(1633913667);
        Integer term286452 = new Integer(1292332296);
        Class<? extends Object> term287124 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term287123 = ((Class) term287124).getDeclaredField((String) "REISSUE");
        ((Field) term287123).setAccessible(true);
        Object enum693 = ((Field) term287123).get((Object) null);
        term286348 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term286432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286437 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term286348, term286348.getClass(), "ps_result", enum691);
        setField(term286348, term286348.getClass(), "accept_idx", term286361);
        setField(term286348, term286348.getClass(), "nblss_ltt_stts", term286363);
        setField(term286348, term286348.getClass(), "nblss_ltt_tckt", term286365);
        setField(term286348, term286348.getClass(), "nblss_ltt_is_opn", term286367);
        setField(term286348, term286348.getClass(), "pd_id", term286369);
        setField(term286348, term286348.getClass(), "player_name", "dMpUbtHwly");
        setField(term286348, term286348.getClass(), "sort_kind", enum692);
        setField(term286348, term286348.getClass(), "lv_num", term286400);
        setField(term286348, term286348.getClass(), "lv_pnt", term286402);
        setField(term286348, term286348.getClass(), "lv_str", "bxEEJVIcPG");
        setField(term286348, term286348.getClass(), "lv_efct_id", term286416);
        setField(term286348, term286348.getClass(), "lv_plt_id", term286418);
        setField(term286348, term286348.getClass(), "mdl_eqp_ary", "UttOGDGpEr");
        setIntField(term286433, term286433.getClass(), "year", 2024);
        setShortField(term286433, term286433.getClass(), "month", (short) 3);
        setShortField(term286433, term286433.getClass(), "day", (short) 17);
        setField(term286432, term286432.getClass(), "date", term286433);
        setByteField(term286437, term286437.getClass(), "hour", (byte) 5);
        setByteField(term286437, term286437.getClass(), "minute", (byte) 21);
        setByteField(term286437, term286437.getClass(), "second", (byte) 47);
        setIntField(term286437, term286437.getClass(), "nano", 798433252);
        setField(term286432, term286432.getClass(), "time", term286437);
        setField(term286348, term286348.getClass(), "mdl_eqp_tm", term286432);
        setField(term286348, term286348.getClass(), "skn_eqp", term286442);
        setField(term286348, term286348.getClass(), "btn_se_eqp", term286444);
        setField(term286348, term286348.getClass(), "sld_se_eqp", term286446);
        setField(term286348, term286348.getClass(), "chn_sld_se_eqp", term286448);
        setField(term286348, term286348.getClass(), "sldr_tch_se_eqp", term286450);
        setField(term286348, term286348.getClass(), "vcld_pts", term286452);
        setField(term286348, term286348.getClass(), "passwd_stat", enum693);
        setField(term286348, term286348.getClass(), "cmd", "aPScTdSsoS");
        setField(term286348, term286348.getClass(), "req_id", "CZYngwdoHw");
        setField(term286348, term286348.getClass(), "stat", "ZbWZNiPrBA");
        term286502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286507 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term286503, term286503.getClass(), "year", 2023);
        setShortField(term286503, term286503.getClass(), "month", (short) 7);
        setShortField(term286503, term286503.getClass(), "day", (short) 27);
        setField(term286502, term286502.getClass(), "date", term286503);
        setByteField(term286507, term286507.getClass(), "hour", (byte) 4);
        setByteField(term286507, term286507.getClass(), "minute", (byte) 25);
        setByteField(term286507, term286507.getClass(), "second", (byte) 46);
        setIntField(term286507, term286507.getClass(), "nano", 646465452);
        setField(term286502, term286502.getClass(), "time", term286507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term286502;
        callMethod(klass, "setMdl_eqp_tm", argTypes, term286348, args);
    }

};


