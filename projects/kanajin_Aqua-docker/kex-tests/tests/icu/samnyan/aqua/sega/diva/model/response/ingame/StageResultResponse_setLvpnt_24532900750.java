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

public class StageResultResponse_setLvpnt_24532900750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38186;
     Object term38529;

    public StageResultResponse_setLvpnt_24532900750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38186 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term38381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38386 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term38186, term38186.getClass(), "chllng_kind", 81427089);
        setIntField(term38186, term38186.getClass(), "lv_num_old", 755951489);
        setIntField(term38186, term38186.getClass(), "lv_pnt_old", 1175146356);
        setIntField(term38186, term38186.getClass(), "lv_num", -2137419728);
        setIntField(term38186, term38186.getClass(), "lv_pnt", 1558810715);
        setField(term38186, term38186.getClass(), "lv_str", "oBlIZiyRMS");
        setIntField(term38186, term38186.getClass(), "lv_efct_id", -382652403);
        setIntField(term38186, term38186.getClass(), "lv_plt_id", -2126539433);
        setIntField(term38186, term38186.getClass(), "vcld_pts", 196952878);
        setIntField(term38186, term38186.getClass(), "prsnt_vcld_pts", 802673242);
        setIntField(term38186, term38186.getClass(), "cnp_cid", -1808638031);
        setIntField(term38186, term38186.getClass(), "cnp_val", -1514240086);
        setField(term38186, term38186.getClass(), "cnp_sp", "QUYAkhtCNh");
        setField(term38186, term38186.getClass(), "crwd_kind", "kOaAQOLyqd");
        setField(term38186, term38186.getClass(), "crwd_value", "ICBWiKaeHC");
        setField(term38186, term38186.getClass(), "crwd_str_0", "WAljagiCzu");
        setField(term38186, term38186.getClass(), "crwd_str_1", "XKMXfDZajw");
        setIntField(term38186, term38186.getClass(), "cerwd_kind", 2052244839);
        setIntField(term38186, term38186.getClass(), "cerwd_value", -1763480506);
        setField(term38186, term38186.getClass(), "cerwd_str_0", "avZoBQSrBy");
        setField(term38186, term38186.getClass(), "cerwd_str_1", "KIXGeHXdwi");
        setField(term38186, term38186.getClass(), "ttl_str_ary", "tTfdvLMwEE");
        setField(term38186, term38186.getClass(), "ttl_plt_id_ary", "DiSkERzqOE");
        setField(term38186, term38186.getClass(), "ttl_desc_ary", "hPSZZeYqHQ");
        setField(term38186, term38186.getClass(), "skin_id_ary", "scReMUKyGq");
        setField(term38186, term38186.getClass(), "skin_name_ary", "FmIpnxjRxA");
        setField(term38186, term38186.getClass(), "skin_illust_ary", "FTjxxGvyun");
        setField(term38186, term38186.getClass(), "skin_desc_ary", "qsjXSwKloH");
        setIntField(term38186, term38186.getClass(), "pdddt_flg", -1541297110);
        setIntField(term38382, term38382.getClass(), "year", 2011);
        setShortField(term38382, term38382.getClass(), "month", (short) 10);
        setShortField(term38382, term38382.getClass(), "day", (short) 25);
        setField(term38381, term38381.getClass(), "date", term38382);
        setByteField(term38386, term38386.getClass(), "hour", (byte) 10);
        setByteField(term38386, term38386.getClass(), "minute", (byte) 33);
        setByteField(term38386, term38386.getClass(), "second", (byte) 8);
        setIntField(term38386, term38386.getClass(), "nano", 268304014);
        setField(term38381, term38381.getClass(), "time", term38386);
        setField(term38186, term38186.getClass(), "pdddt_tm", term38381);
        setIntField(term38186, term38186.getClass(), "nblss_ltt_stts", -1581464804);
        setIntField(term38186, term38186.getClass(), "nblss_ltt_tckt", -1954937310);
        setIntField(term38186, term38186.getClass(), "nblss_ltt_is_opn", -460657407);
        setIntField(term38186, term38186.getClass(), "nblss_ltt_prz", 941003590);
        setIntField(term38186, term38186.getClass(), "nblss_ltt_nxt_stts", -1825624890);
        setIntField(term38186, term38186.getClass(), "nblss_ltt_nxt_tckt", 413214164);
        setField(term38186, term38186.getClass(), "my_qst_id", "DDZHUPglvb");
        setField(term38186, term38186.getClass(), "my_qst_r_qid", "rWoaXvNyVg");
        setField(term38186, term38186.getClass(), "my_qst_r_knd", "FLzaBCFjGv");
        setField(term38186, term38186.getClass(), "my_qst_r_vl", "OLYhTSqTqJ");
        setField(term38186, term38186.getClass(), "my_qst_r_nflg", "AIHoadcpQz");
        setField(term38186, term38186.getClass(), "my_ccd_r_qid", "fWMsLtuOEV");
        setField(term38186, term38186.getClass(), "my_ccd_r_hnd", "fvgZQBalnd");
        setField(term38186, term38186.getClass(), "my_ccd_r_vp", "tViQSKUCLE");
        setField(term38186, term38186.getClass(), "cmd", "QbaeHheqiP");
        setField(term38186, term38186.getClass(), "req_id", "gASHxChKwn");
        setField(term38186, term38186.getClass(), "stat", "iasolXlEEn");
        term38529 = new Integer(355911655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term38529;
        callMethod(klass, "setLv_pnt", argTypes, term38186, args);
    }

};


