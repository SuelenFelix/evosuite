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

public class StageResultResponse_setCrwdstr0_62749357661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44921;

    public StageResultResponse_setCrwdstr0_62749357661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44921 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term45116 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45117 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45121 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term44921, term44921.getClass(), "chllng_kind", -2077814162);
        setIntField(term44921, term44921.getClass(), "lv_num_old", 444514470);
        setIntField(term44921, term44921.getClass(), "lv_pnt_old", -147055177);
        setIntField(term44921, term44921.getClass(), "lv_num", 1979044375);
        setIntField(term44921, term44921.getClass(), "lv_pnt", 961252909);
        setField(term44921, term44921.getClass(), "lv_str", "SQnbnBmbcf");
        setIntField(term44921, term44921.getClass(), "lv_efct_id", 1455842357);
        setIntField(term44921, term44921.getClass(), "lv_plt_id", 1349806561);
        setIntField(term44921, term44921.getClass(), "vcld_pts", 923905351);
        setIntField(term44921, term44921.getClass(), "prsnt_vcld_pts", 428360161);
        setIntField(term44921, term44921.getClass(), "cnp_cid", 631528579);
        setIntField(term44921, term44921.getClass(), "cnp_val", -1652091834);
        setField(term44921, term44921.getClass(), "cnp_sp", "jaNVteZrZi");
        setField(term44921, term44921.getClass(), "crwd_kind", "bMRkDiPUGu");
        setField(term44921, term44921.getClass(), "crwd_value", "xjKxECGyLT");
        setField(term44921, term44921.getClass(), "crwd_str_0", "ffKeJGEXBT");
        setField(term44921, term44921.getClass(), "crwd_str_1", "rsnXTpfhqf");
        setIntField(term44921, term44921.getClass(), "cerwd_kind", -282021579);
        setIntField(term44921, term44921.getClass(), "cerwd_value", -1652588127);
        setField(term44921, term44921.getClass(), "cerwd_str_0", "gzvlGZVfnZ");
        setField(term44921, term44921.getClass(), "cerwd_str_1", "rmSqCaXWHi");
        setField(term44921, term44921.getClass(), "ttl_str_ary", "ScztqspySK");
        setField(term44921, term44921.getClass(), "ttl_plt_id_ary", "IvYxGwWoVu");
        setField(term44921, term44921.getClass(), "ttl_desc_ary", "XnZHOhTfxL");
        setField(term44921, term44921.getClass(), "skin_id_ary", "oFBhNamtAs");
        setField(term44921, term44921.getClass(), "skin_name_ary", "YURcpRjwSt");
        setField(term44921, term44921.getClass(), "skin_illust_ary", "SXMdNSGPog");
        setField(term44921, term44921.getClass(), "skin_desc_ary", "vsqwOLpDjj");
        setIntField(term44921, term44921.getClass(), "pdddt_flg", -1902823385);
        setIntField(term45117, term45117.getClass(), "year", 2016);
        setShortField(term45117, term45117.getClass(), "month", (short) 2);
        setShortField(term45117, term45117.getClass(), "day", (short) 25);
        setField(term45116, term45116.getClass(), "date", term45117);
        setByteField(term45121, term45121.getClass(), "hour", (byte) 8);
        setByteField(term45121, term45121.getClass(), "minute", (byte) 54);
        setByteField(term45121, term45121.getClass(), "second", (byte) 40);
        setIntField(term45121, term45121.getClass(), "nano", 124525896);
        setField(term45116, term45116.getClass(), "time", term45121);
        setField(term44921, term44921.getClass(), "pdddt_tm", term45116);
        setIntField(term44921, term44921.getClass(), "nblss_ltt_stts", -784924879);
        setIntField(term44921, term44921.getClass(), "nblss_ltt_tckt", -1062027102);
        setIntField(term44921, term44921.getClass(), "nblss_ltt_is_opn", 1763217806);
        setIntField(term44921, term44921.getClass(), "nblss_ltt_prz", 1644949396);
        setIntField(term44921, term44921.getClass(), "nblss_ltt_nxt_stts", -2017073245);
        setIntField(term44921, term44921.getClass(), "nblss_ltt_nxt_tckt", 522440332);
        setField(term44921, term44921.getClass(), "my_qst_id", "rJgXQRsPCl");
        setField(term44921, term44921.getClass(), "my_qst_r_qid", "RgqpoBknjN");
        setField(term44921, term44921.getClass(), "my_qst_r_knd", "nUDhadopHE");
        setField(term44921, term44921.getClass(), "my_qst_r_vl", "vLrTnQTIPg");
        setField(term44921, term44921.getClass(), "my_qst_r_nflg", "GsXvLZCFtf");
        setField(term44921, term44921.getClass(), "my_ccd_r_qid", "JqSCTBGSUs");
        setField(term44921, term44921.getClass(), "my_ccd_r_hnd", "bZrrPiMnsr");
        setField(term44921, term44921.getClass(), "my_ccd_r_vp", "IeromvfDmz");
        setField(term44921, term44921.getClass(), "cmd", "xJLHPTRSqe");
        setField(term44921, term44921.getClass(), "req_id", "OIFZYdbUZz");
        setField(term44921, term44921.getClass(), "stat", "FPablxseTr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wNndrIQDbr";
        callMethod(klass, "setCrwd_str_0", argTypes, term44921, args);
    }

};


