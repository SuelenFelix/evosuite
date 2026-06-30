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
import java.lang.Integer;

public class StageResultResponse_setCnpval_58822414357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42441;
     Object term42784;

    public StageResultResponse_setCnpval_58822414357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42441 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term42636 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42637 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42641 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term42441, term42441.getClass(), "chllng_kind", -938127737);
        setIntField(term42441, term42441.getClass(), "lv_num_old", -1408678076);
        setIntField(term42441, term42441.getClass(), "lv_pnt_old", 1201413899);
        setIntField(term42441, term42441.getClass(), "lv_num", -376722373);
        setIntField(term42441, term42441.getClass(), "lv_pnt", 1180687854);
        setField(term42441, term42441.getClass(), "lv_str", "woQcQRYwNH");
        setIntField(term42441, term42441.getClass(), "lv_efct_id", 328631288);
        setIntField(term42441, term42441.getClass(), "lv_plt_id", -1631415805);
        setIntField(term42441, term42441.getClass(), "vcld_pts", 1073400519);
        setIntField(term42441, term42441.getClass(), "prsnt_vcld_pts", -2025555268);
        setIntField(term42441, term42441.getClass(), "cnp_cid", -746950289);
        setIntField(term42441, term42441.getClass(), "cnp_val", -137577510);
        setField(term42441, term42441.getClass(), "cnp_sp", "uQjzusifTg");
        setField(term42441, term42441.getClass(), "crwd_kind", "mOulGkUjOk");
        setField(term42441, term42441.getClass(), "crwd_value", "hNWRuNEgOf");
        setField(term42441, term42441.getClass(), "crwd_str_0", "CEtjGBplmv");
        setField(term42441, term42441.getClass(), "crwd_str_1", "XosDTAzIAT");
        setIntField(term42441, term42441.getClass(), "cerwd_kind", 719185716);
        setIntField(term42441, term42441.getClass(), "cerwd_value", 1624820010);
        setField(term42441, term42441.getClass(), "cerwd_str_0", "lcCEhCpiZM");
        setField(term42441, term42441.getClass(), "cerwd_str_1", "OPJlqMJxdq");
        setField(term42441, term42441.getClass(), "ttl_str_ary", "COhzwXcfds");
        setField(term42441, term42441.getClass(), "ttl_plt_id_ary", "anncJTnzrg");
        setField(term42441, term42441.getClass(), "ttl_desc_ary", "GMylOocLnB");
        setField(term42441, term42441.getClass(), "skin_id_ary", "spOehuHwSl");
        setField(term42441, term42441.getClass(), "skin_name_ary", "cyobgydTWP");
        setField(term42441, term42441.getClass(), "skin_illust_ary", "moHYQFfLnp");
        setField(term42441, term42441.getClass(), "skin_desc_ary", "BrPqlvIbEQ");
        setIntField(term42441, term42441.getClass(), "pdddt_flg", -831921156);
        setIntField(term42637, term42637.getClass(), "year", 2022);
        setShortField(term42637, term42637.getClass(), "month", (short) 6);
        setShortField(term42637, term42637.getClass(), "day", (short) 20);
        setField(term42636, term42636.getClass(), "date", term42637);
        setByteField(term42641, term42641.getClass(), "hour", (byte) 7);
        setByteField(term42641, term42641.getClass(), "minute", (byte) 57);
        setByteField(term42641, term42641.getClass(), "second", (byte) 37);
        setIntField(term42641, term42641.getClass(), "nano", 90374877);
        setField(term42636, term42636.getClass(), "time", term42641);
        setField(term42441, term42441.getClass(), "pdddt_tm", term42636);
        setIntField(term42441, term42441.getClass(), "nblss_ltt_stts", -2085566906);
        setIntField(term42441, term42441.getClass(), "nblss_ltt_tckt", 1773193728);
        setIntField(term42441, term42441.getClass(), "nblss_ltt_is_opn", -1341357647);
        setIntField(term42441, term42441.getClass(), "nblss_ltt_prz", 138447019);
        setIntField(term42441, term42441.getClass(), "nblss_ltt_nxt_stts", 114915275);
        setIntField(term42441, term42441.getClass(), "nblss_ltt_nxt_tckt", 338519695);
        setField(term42441, term42441.getClass(), "my_qst_id", "JDTrhGRsDT");
        setField(term42441, term42441.getClass(), "my_qst_r_qid", "vHxsVQImjS");
        setField(term42441, term42441.getClass(), "my_qst_r_knd", "jkVaRrZHQX");
        setField(term42441, term42441.getClass(), "my_qst_r_vl", "gSFFUuJipG");
        setField(term42441, term42441.getClass(), "my_qst_r_nflg", "bQWfIFvxkQ");
        setField(term42441, term42441.getClass(), "my_ccd_r_qid", "aDoBLXfFQI");
        setField(term42441, term42441.getClass(), "my_ccd_r_hnd", "HTimNhSNVi");
        setField(term42441, term42441.getClass(), "my_ccd_r_vp", "IWJWbrHcqm");
        setField(term42441, term42441.getClass(), "cmd", "ucTcadpUdW");
        setField(term42441, term42441.getClass(), "req_id", "AscVKZhCwm");
        setField(term42441, term42441.getClass(), "stat", "HCvSsQWjLn");
        term42784 = new Integer(2025566580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term42784;
        callMethod(klass, "setCnp_val", argTypes, term42441, args);
    }

};


