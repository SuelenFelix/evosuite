package icu.samnyan.aqua.api.model.resp.sega.ongeki;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ProfileResp_setBattlePoint_71932672037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98003;
     Object term98042;

    public ProfileResp_setBattlePoint_71932672037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98003 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98003, term98003.getClass(), "userName", "JzQtKVDWeX");
        setIntField(term98003, term98003.getClass(), "level", 1061901020);
        setLongField(term98003, term98003.getClass(), "exp", -1618481608996124894L);
        setLongField(term98003, term98003.getClass(), "point", -7044858981045809848L);
        setLongField(term98003, term98003.getClass(), "totalPoint", -2399581411225761909L);
        setIntField(term98003, term98003.getClass(), "playCount", 2146296423);
        setIntField(term98003, term98003.getClass(), "jewelCount", 1592995555);
        setIntField(term98003, term98003.getClass(), "totalJewelCount", 10431539);
        setIntField(term98003, term98003.getClass(), "playerRating", 2129296711);
        setIntField(term98003, term98003.getClass(), "highestRating", -44548911);
        setIntField(term98003, term98003.getClass(), "battlePoint", -634048491);
        setIntField(term98003, term98003.getClass(), "nameplateId", -1304849956);
        setIntField(term98003, term98003.getClass(), "trophyId", -470529597);
        setIntField(term98003, term98003.getClass(), "cardId", -576113658);
        setIntField(term98003, term98003.getClass(), "characterId", 561781134);
        setLongField(term98003, term98003.getClass(), "sumTechHighScore", 6838360539524603827L);
        setLongField(term98003, term98003.getClass(), "sumTechBasicHighScore", 3645049769064707157L);
        setLongField(term98003, term98003.getClass(), "sumTechAdvancedHighScore", -5403608159440697074L);
        setLongField(term98003, term98003.getClass(), "sumTechExpertHighScore", -1325819407199766515L);
        setLongField(term98003, term98003.getClass(), "sumTechMasterHighScore", 6448648790433973386L);
        setLongField(term98003, term98003.getClass(), "sumTechLunaticHighScore", -8369210930627405290L);
        setLongField(term98003, term98003.getClass(), "sumBattleHighScore", -3991405205763855637L);
        setLongField(term98003, term98003.getClass(), "sumBattleBasicHighScore", -3582519144397090903L);
        setLongField(term98003, term98003.getClass(), "sumBattleAdvancedHighScore", 5365457211091588386L);
        setLongField(term98003, term98003.getClass(), "sumBattleExpertHighScore", -8312607175567451875L);
        setLongField(term98003, term98003.getClass(), "sumBattleMasterHighScore", -1078176569817070277L);
        setLongField(term98003, term98003.getClass(), "sumBattleLunaticHighScore", 579792316384587624L);
        term98042 = new Integer(-1650485890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term98042;
        callMethod(klass, "setBattlePoint", argTypes, term98003, args);
    }

};


