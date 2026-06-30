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

public class PreStartResponse_setPdid_43263470429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276409;
     Object term276562;

    public PreStartResponse_setPdid_43263470429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term276565 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term276564 = ((Class) term276565).getDeclaredField((String) "CARD_BANNED");
        ((Field) term276564).setAccessible(true);
        Object enum663 = ((Field) term276564).get((Object) null);
        Integer term276426 = new Integer(-1748391876);
        Integer term276428 = new Integer(43258317);
        Integer term276430 = new Integer(1707220033);
        Integer term276432 = new Integer(-1792504217);
        Integer term276434 = new Integer(1824538861);
        Class<? extends Object> term276885 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term276884 = ((Class) term276885).getDeclaredField((String) "MY_LIST_A");
        ((Field) term276884).setAccessible(true);
        Object enum664 = ((Field) term276884).get((Object) null);
        Integer term276462 = new Integer(499519708);
        Integer term276464 = new Integer(1501165033);
        Integer term276478 = new Integer(510162332);
        Integer term276480 = new Integer(888506903);
        Integer term276504 = new Integer(200252898);
        Integer term276506 = new Integer(-1831826725);
        Integer term276508 = new Integer(752152965);
        Integer term276510 = new Integer(-1577069773);
        Integer term276512 = new Integer(-266625190);
        Integer term276514 = new Integer(489201218);
        Class<? extends Object> term277179 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term277178 = ((Class) term277179).getDeclaredField((String) "RESET");
        ((Field) term277178).setAccessible(true);
        Object enum665 = ((Field) term277178).get((Object) null);
        term276409 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term276494 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term276495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term276499 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term276409, term276409.getClass(), "ps_result", enum663);
        setField(term276409, term276409.getClass(), "accept_idx", term276426);
        setField(term276409, term276409.getClass(), "nblss_ltt_stts", term276428);
        setField(term276409, term276409.getClass(), "nblss_ltt_tckt", term276430);
        setField(term276409, term276409.getClass(), "nblss_ltt_is_opn", term276432);
        setField(term276409, term276409.getClass(), "pd_id", term276434);
        setField(term276409, term276409.getClass(), "player_name", "FtOpFdJBak");
        setField(term276409, term276409.getClass(), "sort_kind", enum664);
        setField(term276409, term276409.getClass(), "lv_num", term276462);
        setField(term276409, term276409.getClass(), "lv_pnt", term276464);
        setField(term276409, term276409.getClass(), "lv_str", "mqiIwoVVkU");
        setField(term276409, term276409.getClass(), "lv_efct_id", term276478);
        setField(term276409, term276409.getClass(), "lv_plt_id", term276480);
        setField(term276409, term276409.getClass(), "mdl_eqp_ary", "LYcLrQMkAA");
        setIntField(term276495, term276495.getClass(), "year", 2023);
        setShortField(term276495, term276495.getClass(), "month", (short) 5);
        setShortField(term276495, term276495.getClass(), "day", (short) 31);
        setField(term276494, term276494.getClass(), "date", term276495);
        setByteField(term276499, term276499.getClass(), "hour", (byte) 13);
        setByteField(term276499, term276499.getClass(), "minute", (byte) 29);
        setByteField(term276499, term276499.getClass(), "second", (byte) 29);
        setIntField(term276499, term276499.getClass(), "nano", 621312201);
        setField(term276494, term276494.getClass(), "time", term276499);
        setField(term276409, term276409.getClass(), "mdl_eqp_tm", term276494);
        setField(term276409, term276409.getClass(), "skn_eqp", term276504);
        setField(term276409, term276409.getClass(), "btn_se_eqp", term276506);
        setField(term276409, term276409.getClass(), "sld_se_eqp", term276508);
        setField(term276409, term276409.getClass(), "chn_sld_se_eqp", term276510);
        setField(term276409, term276409.getClass(), "sldr_tch_se_eqp", term276512);
        setField(term276409, term276409.getClass(), "vcld_pts", term276514);
        setField(term276409, term276409.getClass(), "passwd_stat", enum665);
        setField(term276409, term276409.getClass(), "cmd", "XhbGnImmgd");
        setField(term276409, term276409.getClass(), "req_id", "UUTpuViRuV");
        setField(term276409, term276409.getClass(), "stat", "xNKBQkfPIU");
        term276562 = new Integer(464181937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term276562;
        callMethod(klass, "setPd_id", argTypes, term276409, args);
    }

};


