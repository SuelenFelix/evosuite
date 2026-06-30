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

public class PreStartResponse_setNblssltttckt_53968563227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274263;
     Object term274423;

    public PreStartResponse_setNblssltttckt_53968563227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term274426 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term274425 = ((Class) term274426).getDeclaredField((String) "NEW_REGISTRATION");
        ((Field) term274425).setAccessible(true);
        Object enum657 = ((Field) term274425).get((Object) null);
        Integer term274285 = new Integer(1084849225);
        Integer term274287 = new Integer(-1702055571);
        Integer term274289 = new Integer(-944542900);
        Integer term274291 = new Integer(2063762142);
        Integer term274293 = new Integer(1658391716);
        Class<? extends Object> term274761 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term274760 = ((Class) term274761).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term274760).setAccessible(true);
        Object enum658 = ((Field) term274760).get((Object) null);
        Integer term274324 = new Integer(2143282300);
        Integer term274326 = new Integer(1137624258);
        Integer term274340 = new Integer(977862393);
        Integer term274342 = new Integer(301401782);
        Integer term274366 = new Integer(1988605357);
        Integer term274368 = new Integer(808203320);
        Integer term274370 = new Integer(-544382127);
        Integer term274372 = new Integer(-1830198043);
        Integer term274374 = new Integer(-439048495);
        Integer term274376 = new Integer(-1849105286);
        Class<? extends Object> term275064 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term275063 = ((Class) term275064).getDeclaredField((String) "MISS");
        ((Field) term275063).setAccessible(true);
        Object enum659 = ((Field) term275063).get((Object) null);
        term274263 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term274356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274361 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term274263, term274263.getClass(), "ps_result", enum657);
        setField(term274263, term274263.getClass(), "accept_idx", term274285);
        setField(term274263, term274263.getClass(), "nblss_ltt_stts", term274287);
        setField(term274263, term274263.getClass(), "nblss_ltt_tckt", term274289);
        setField(term274263, term274263.getClass(), "nblss_ltt_is_opn", term274291);
        setField(term274263, term274263.getClass(), "pd_id", term274293);
        setField(term274263, term274263.getClass(), "player_name", "ucSkoerFDq");
        setField(term274263, term274263.getClass(), "sort_kind", enum658);
        setField(term274263, term274263.getClass(), "lv_num", term274324);
        setField(term274263, term274263.getClass(), "lv_pnt", term274326);
        setField(term274263, term274263.getClass(), "lv_str", "UasONzOTXn");
        setField(term274263, term274263.getClass(), "lv_efct_id", term274340);
        setField(term274263, term274263.getClass(), "lv_plt_id", term274342);
        setField(term274263, term274263.getClass(), "mdl_eqp_ary", "gRkWWojcfo");
        setIntField(term274357, term274357.getClass(), "year", 2010);
        setShortField(term274357, term274357.getClass(), "month", (short) 1);
        setShortField(term274357, term274357.getClass(), "day", (short) 10);
        setField(term274356, term274356.getClass(), "date", term274357);
        setByteField(term274361, term274361.getClass(), "hour", (byte) 12);
        setByteField(term274361, term274361.getClass(), "minute", (byte) 46);
        setByteField(term274361, term274361.getClass(), "second", (byte) 5);
        setIntField(term274361, term274361.getClass(), "nano", 540440953);
        setField(term274356, term274356.getClass(), "time", term274361);
        setField(term274263, term274263.getClass(), "mdl_eqp_tm", term274356);
        setField(term274263, term274263.getClass(), "skn_eqp", term274366);
        setField(term274263, term274263.getClass(), "btn_se_eqp", term274368);
        setField(term274263, term274263.getClass(), "sld_se_eqp", term274370);
        setField(term274263, term274263.getClass(), "chn_sld_se_eqp", term274372);
        setField(term274263, term274263.getClass(), "sldr_tch_se_eqp", term274374);
        setField(term274263, term274263.getClass(), "vcld_pts", term274376);
        setField(term274263, term274263.getClass(), "passwd_stat", enum659);
        setField(term274263, term274263.getClass(), "cmd", "FHujUNXIxu");
        setField(term274263, term274263.getClass(), "req_id", "OMWsPUFcoJ");
        setField(term274263, term274263.getClass(), "stat", "oWooJBZOyh");
        term274423 = new Integer(1334483645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term274423;
        callMethod(klass, "setNblss_ltt_tckt", argTypes, term274263, args);
    }

};


