package icu.samnyan.aqua.sega.diva.model.response.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StageResultResponse_getNblsslttstts_179263385032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27324;

    public StageResultResponse_getNblsslttstts_179263385032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27324 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term27519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27524 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term27324, term27324.getClass(), "chllng_kind", 872295704);
        setIntField(term27324, term27324.getClass(), "lv_num_old", 86041387);
        setIntField(term27324, term27324.getClass(), "lv_pnt_old", 1010721666);
        setIntField(term27324, term27324.getClass(), "lv_num", 27043781);
        setIntField(term27324, term27324.getClass(), "lv_pnt", -1367122405);
        setField(term27324, term27324.getClass(), "lv_str", "GuVQjhBxma");
        setIntField(term27324, term27324.getClass(), "lv_efct_id", -1703625118);
        setIntField(term27324, term27324.getClass(), "lv_plt_id", 1104108112);
        setIntField(term27324, term27324.getClass(), "vcld_pts", 1648665618);
        setIntField(term27324, term27324.getClass(), "prsnt_vcld_pts", 633765954);
        setIntField(term27324, term27324.getClass(), "cnp_cid", 269110087);
        setIntField(term27324, term27324.getClass(), "cnp_val", 1545119095);
        setField(term27324, term27324.getClass(), "cnp_sp", "WAVMPPbIfL");
        setField(term27324, term27324.getClass(), "crwd_kind", "GISHLsgALf");
        setField(term27324, term27324.getClass(), "crwd_value", "PVykkUSgBq");
        setField(term27324, term27324.getClass(), "crwd_str_0", "tnKbZaCsuj");
        setField(term27324, term27324.getClass(), "crwd_str_1", "ZFpcYBgLNC");
        setIntField(term27324, term27324.getClass(), "cerwd_kind", 1671229683);
        setIntField(term27324, term27324.getClass(), "cerwd_value", 34167717);
        setField(term27324, term27324.getClass(), "cerwd_str_0", "VAGkRppBem");
        setField(term27324, term27324.getClass(), "cerwd_str_1", "eKcEJRxNSu");
        setField(term27324, term27324.getClass(), "ttl_str_ary", "NTXQPWFYSA");
        setField(term27324, term27324.getClass(), "ttl_plt_id_ary", "fOuOhBpldm");
        setField(term27324, term27324.getClass(), "ttl_desc_ary", "qQQRKGPyIM");
        setField(term27324, term27324.getClass(), "skin_id_ary", "lzcwhvjdFg");
        setField(term27324, term27324.getClass(), "skin_name_ary", "dfzWTjcjnI");
        setField(term27324, term27324.getClass(), "skin_illust_ary", "bsnZXGEvFv");
        setField(term27324, term27324.getClass(), "skin_desc_ary", "osFrHWYeRy");
        setIntField(term27324, term27324.getClass(), "pdddt_flg", -514195141);
        setIntField(term27520, term27520.getClass(), "year", 2012);
        setShortField(term27520, term27520.getClass(), "month", (short) 8);
        setShortField(term27520, term27520.getClass(), "day", (short) 25);
        setField(term27519, term27519.getClass(), "date", term27520);
        setByteField(term27524, term27524.getClass(), "hour", (byte) 19);
        setByteField(term27524, term27524.getClass(), "minute", (byte) 49);
        setByteField(term27524, term27524.getClass(), "second", (byte) 8);
        setIntField(term27524, term27524.getClass(), "nano", 912685024);
        setField(term27519, term27519.getClass(), "time", term27524);
        setField(term27324, term27324.getClass(), "pdddt_tm", term27519);
        setIntField(term27324, term27324.getClass(), "nblss_ltt_stts", -297946422);
        setIntField(term27324, term27324.getClass(), "nblss_ltt_tckt", 385463636);
        setIntField(term27324, term27324.getClass(), "nblss_ltt_is_opn", -1677599962);
        setIntField(term27324, term27324.getClass(), "nblss_ltt_prz", -1790275458);
        setIntField(term27324, term27324.getClass(), "nblss_ltt_nxt_stts", -497534255);
        setIntField(term27324, term27324.getClass(), "nblss_ltt_nxt_tckt", 1588942911);
        setField(term27324, term27324.getClass(), "my_qst_id", "scpIQUfPKw");
        setField(term27324, term27324.getClass(), "my_qst_r_qid", "QKYBpCjuYt");
        setField(term27324, term27324.getClass(), "my_qst_r_knd", "vjiRfoGdkl");
        setField(term27324, term27324.getClass(), "my_qst_r_vl", "TwaxeSHvnR");
        setField(term27324, term27324.getClass(), "my_qst_r_nflg", "paPzDETzIq");
        setField(term27324, term27324.getClass(), "my_ccd_r_qid", "fufeuGfwpN");
        setField(term27324, term27324.getClass(), "my_ccd_r_hnd", "XJbkXbljvz");
        setField(term27324, term27324.getClass(), "my_ccd_r_vp", "fuvdkDwBeH");
        setField(term27324, term27324.getClass(), "cmd", "NTefzwLPhx");
        setField(term27324, term27324.getClass(), "req_id", "dirFuhqyNu");
        setField(term27324, term27324.getClass(), "stat", "YVLRenzuoR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_ltt_stts", argTypes, term27324, args);
    }

};


