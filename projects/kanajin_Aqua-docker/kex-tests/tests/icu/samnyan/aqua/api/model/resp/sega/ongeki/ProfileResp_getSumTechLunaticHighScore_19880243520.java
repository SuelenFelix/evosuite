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

public class ProfileResp_getSumTechLunaticHighScore_19880243520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97130;

    public ProfileResp_getSumTechLunaticHighScore_19880243520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97130 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97130, term97130.getClass(), "userName", "YMTMppTRcY");
        setIntField(term97130, term97130.getClass(), "level", 656577433);
        setLongField(term97130, term97130.getClass(), "exp", -3761687501434493555L);
        setLongField(term97130, term97130.getClass(), "point", 6923371778481878441L);
        setLongField(term97130, term97130.getClass(), "totalPoint", -2664657769396188905L);
        setIntField(term97130, term97130.getClass(), "playCount", 1898583842);
        setIntField(term97130, term97130.getClass(), "jewelCount", 990480748);
        setIntField(term97130, term97130.getClass(), "totalJewelCount", 1525940107);
        setIntField(term97130, term97130.getClass(), "playerRating", -1502046325);
        setIntField(term97130, term97130.getClass(), "highestRating", 2145646050);
        setIntField(term97130, term97130.getClass(), "battlePoint", -534433577);
        setIntField(term97130, term97130.getClass(), "nameplateId", 337039095);
        setIntField(term97130, term97130.getClass(), "trophyId", -976150853);
        setIntField(term97130, term97130.getClass(), "cardId", 2041456648);
        setIntField(term97130, term97130.getClass(), "characterId", -1238325395);
        setLongField(term97130, term97130.getClass(), "sumTechHighScore", -7805613835090517266L);
        setLongField(term97130, term97130.getClass(), "sumTechBasicHighScore", -2960551939365707278L);
        setLongField(term97130, term97130.getClass(), "sumTechAdvancedHighScore", 6033165802535975223L);
        setLongField(term97130, term97130.getClass(), "sumTechExpertHighScore", 2755312857820090237L);
        setLongField(term97130, term97130.getClass(), "sumTechMasterHighScore", -7834079687983203731L);
        setLongField(term97130, term97130.getClass(), "sumTechLunaticHighScore", 7406582048091992868L);
        setLongField(term97130, term97130.getClass(), "sumBattleHighScore", 2503971592095458212L);
        setLongField(term97130, term97130.getClass(), "sumBattleBasicHighScore", 483652353726945577L);
        setLongField(term97130, term97130.getClass(), "sumBattleAdvancedHighScore", 5923292358480924028L);
        setLongField(term97130, term97130.getClass(), "sumBattleExpertHighScore", -8917633736802211417L);
        setLongField(term97130, term97130.getClass(), "sumBattleMasterHighScore", 6841951969811132105L);
        setLongField(term97130, term97130.getClass(), "sumBattleLunaticHighScore", 7029460330693322196L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechLunaticHighScore", argTypes, term97130, args);
    }

};


