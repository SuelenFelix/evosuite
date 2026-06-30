package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ProfileResp_setAvatarFace_203161266963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121722;
     Object term121797;

    public ProfileResp_setAvatarFace_203161266963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121722 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term121765 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121770 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121775 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121776 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121780 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term121722, term121722.getClass(), "userName", "uMrJeSSvdc");
        setIntField(term121722, term121722.getClass(), "level", -1159099513);
        setField(term121722, term121722.getClass(), "exp", "pRVgwFARqj");
        setLongField(term121722, term121722.getClass(), "point", -1858184347421260731L);
        setLongField(term121722, term121722.getClass(), "totalPoint", -2426671262366817199L);
        setIntField(term121722, term121722.getClass(), "playCount", 979587000);
        setIntField(term121722, term121722.getClass(), "playerRating", -603960933);
        setIntField(term121722, term121722.getClass(), "highestRating", 1644771358);
        setIntField(term121722, term121722.getClass(), "nameplateId", -1591841423);
        setIntField(term121722, term121722.getClass(), "frameId", 1200324792);
        setIntField(term121722, term121722.getClass(), "characterId", 1125442734);
        setIntField(term121722, term121722.getClass(), "trophyId", -1011364808);
        setIntField(term121722, term121722.getClass(), "totalMapNum", -1542714981);
        setLongField(term121722, term121722.getClass(), "totalHiScore", 2123521425879678249L);
        setLongField(term121722, term121722.getClass(), "totalBasicHighScore", -2134379872585283267L);
        setLongField(term121722, term121722.getClass(), "totalAdvancedHighScore", -3093522555278263065L);
        setLongField(term121722, term121722.getClass(), "totalExpertHighScore", 8815838186215527625L);
        setLongField(term121722, term121722.getClass(), "totalMasterHighScore", -6178872806819516827L);
        setLongField(term121722, term121722.getClass(), "totalUltimaHighScore", 3667519110548561757L);
        setIntField(term121722, term121722.getClass(), "friendCount", 1722191356);
        setIntField(term121766, term121766.getClass(), "year", 2011);
        setShortField(term121766, term121766.getClass(), "month", (short) 11);
        setShortField(term121766, term121766.getClass(), "day", (short) 27);
        setField(term121765, term121765.getClass(), "date", term121766);
        setByteField(term121770, term121770.getClass(), "hour", (byte) 4);
        setByteField(term121770, term121770.getClass(), "minute", (byte) 35);
        setByteField(term121770, term121770.getClass(), "second", (byte) 9);
        setIntField(term121770, term121770.getClass(), "nano", 764803784);
        setField(term121765, term121765.getClass(), "time", term121770);
        setField(term121722, term121722.getClass(), "firstPlayDate", term121765);
        setIntField(term121776, term121776.getClass(), "year", 2026);
        setShortField(term121776, term121776.getClass(), "month", (short) 7);
        setShortField(term121776, term121776.getClass(), "day", (short) 9);
        setField(term121775, term121775.getClass(), "date", term121776);
        setByteField(term121780, term121780.getClass(), "hour", (byte) 19);
        setByteField(term121780, term121780.getClass(), "minute", (byte) 5);
        setByteField(term121780, term121780.getClass(), "second", (byte) 54);
        setIntField(term121780, term121780.getClass(), "nano", 185302205);
        setField(term121775, term121775.getClass(), "time", term121780);
        setField(term121722, term121722.getClass(), "lastPlayDate", term121775);
        setIntField(term121722, term121722.getClass(), "courseClass", -528238169);
        setIntField(term121722, term121722.getClass(), "overPowerPoint", -193601102);
        setIntField(term121722, term121722.getClass(), "overPowerRate", 1094287763);
        setIntField(term121722, term121722.getClass(), "mapIconId", 1487185251);
        setIntField(term121722, term121722.getClass(), "voiceId", 2124847420);
        setIntField(term121722, term121722.getClass(), "avatarWear", -895455844);
        setIntField(term121722, term121722.getClass(), "avatarHead", -683802843);
        setIntField(term121722, term121722.getClass(), "avatarFace", -292264758);
        setIntField(term121722, term121722.getClass(), "avatarSkin", -1273682903);
        setIntField(term121722, term121722.getClass(), "avatarItem", -890740216);
        setIntField(term121722, term121722.getClass(), "avatarFront", -1002221056);
        setIntField(term121722, term121722.getClass(), "avatarBack", -334409497);
        term121797 = new Integer(-287319176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term121797;
        callMethod(klass, "setAvatarFace", argTypes, term121722, args);
    }

};


