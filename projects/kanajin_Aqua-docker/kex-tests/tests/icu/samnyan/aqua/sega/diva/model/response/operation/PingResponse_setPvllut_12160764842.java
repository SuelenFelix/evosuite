package icu.samnyan.aqua.sega.diva.model.response.operation;

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
import static icu.samnyan.aqua.sega.diva.model.response.operation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PingResponse_setPvllut_12160764842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29669;

    public PingResponse_setPvllut_12160764842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29983 = new Integer(1386130016);
        Integer term29985 = new Integer(1072005683);
        Integer term29987 = new Integer(1861318859);
        term29669 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse"));
        setField(term29669, term29669.getClass(), "ping_b_msg", "RIGChgqpTI");
        setField(term29669, term29669.getClass(), "ping_m_msg", "YCrgXnhgoK");
        setField(term29669, term29669.getClass(), "atnd_lut", "nQodIeQekM");
        setField(term29669, term29669.getClass(), "fi_lut", "YXORpHCDcd");
        setField(term29669, term29669.getClass(), "ci_lut", "XzZbAcRADD");
        setField(term29669, term29669.getClass(), "qi_lut", "UqSNWSoTRy");
        setField(term29669, term29669.getClass(), "pvl_lut", "VesRqDfjMa");
        setField(term29669, term29669.getClass(), "pdcl_lut", "AQTTebOiZR");
        setField(term29669, term29669.getClass(), "pnml_lut", "mgeIhswNtk");
        setField(term29669, term29669.getClass(), "cinml_lut", "QwKYpiVQlL");
        setField(term29669, term29669.getClass(), "rwl_lut", "kSGsHNQQoW");
        setField(term29669, term29669.getClass(), "bdlol_lut", "MWezlyjdaG");
        setField(term29669, term29669.getClass(), "shp_ctlg_lut", "drpBJuEKQG");
        setField(term29669, term29669.getClass(), "cstmz_itm_ctlg_lut", "GGpORnLrOW");
        setField(term29669, term29669.getClass(), "ngwl_lut", "gDGZwlpOZx");
        setField(term29669, term29669.getClass(), "rnk_nv_lut", "gkDpxkHPDg");
        setField(term29669, term29669.getClass(), "rnk_ps_lut", "pADwkrWiMW");
        setField(term29669, term29669.getClass(), "bi_lut", "FDORDJuAXQ");
        setField(term29669, term29669.getClass(), "cpi_lut", "yjqoDeLBLg");
        setField(term29669, term29669.getClass(), "p_std_hc_lut", "DCepDqVwas");
        setField(term29669, term29669.getClass(), "p_std_i_n_lut", "wKIBUlfNCx");
        setField(term29669, term29669.getClass(), "req_inv_cmd_num", "iGfMUWRvod");
        setField(term29669, term29669.getClass(), "req_inv_cmd_prm1", "zUXaSvayQe");
        setField(term29669, term29669.getClass(), "req_inv_cmd_prm2", "bPVcnnQPSC");
        setField(term29669, term29669.getClass(), "req_inv_cmd_prm3", "PQLyoEKWSa");
        setField(term29669, term29669.getClass(), "req_inv_cmd_prm4", "HOgkhttJZS");
        setBooleanField(term29669, term29669.getClass(), "pow_save_flg", false);
        setField(term29669, term29669.getClass(), "nblss_dnt_p", term29983);
        setField(term29669, term29669.getClass(), "nblss_ltt_rl_vp", term29985);
        setField(term29669, term29669.getClass(), "nblss_ex_ltt_flg", term29987);
        setField(term29669, term29669.getClass(), "nblss_dnt_st_tm", "goqNSmXSSS");
        setField(term29669, term29669.getClass(), "nblss_dnt_ed_tm", "AkViBLdqXM");
        setField(term29669, term29669.getClass(), "nblss_ltt_st_tm", "UlxGFzEifL");
        setField(term29669, term29669.getClass(), "nblss_ltt_ed_tm", "HilHTbDKDF");
        setField(term29669, term29669.getClass(), "cmd", "IaEqlVwmNS");
        setField(term29669, term29669.getClass(), "req_id", "ljNOgdPWrL");
        setField(term29669, term29669.getClass(), "stat", "oBlIZiyRMS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.operation.PingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QUYAkhtCNh";
        callMethod(klass, "setPvl_lut", argTypes, term29669, args);
    }

};


