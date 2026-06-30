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

public class ProfileResp_setPlayCount_74121197132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97748;
     Object term97787;

    public ProfileResp_setPlayCount_74121197132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97748 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97748, term97748.getClass(), "userName", "QsTeQoennG");
        setIntField(term97748, term97748.getClass(), "level", 2029529208);
        setLongField(term97748, term97748.getClass(), "exp", -6836919765491154407L);
        setLongField(term97748, term97748.getClass(), "point", -2200241182129794191L);
        setLongField(term97748, term97748.getClass(), "totalPoint", -1501783656287335632L);
        setIntField(term97748, term97748.getClass(), "playCount", -1301133780);
        setIntField(term97748, term97748.getClass(), "jewelCount", -1078238868);
        setIntField(term97748, term97748.getClass(), "totalJewelCount", -912824629);
        setIntField(term97748, term97748.getClass(), "playerRating", -1049478321);
        setIntField(term97748, term97748.getClass(), "highestRating", -1168929868);
        setIntField(term97748, term97748.getClass(), "battlePoint", -831051521);
        setIntField(term97748, term97748.getClass(), "nameplateId", -1141163854);
        setIntField(term97748, term97748.getClass(), "trophyId", -1015993088);
        setIntField(term97748, term97748.getClass(), "cardId", -120593310);
        setIntField(term97748, term97748.getClass(), "characterId", 1357256293);
        setLongField(term97748, term97748.getClass(), "sumTechHighScore", 1194222040417145789L);
        setLongField(term97748, term97748.getClass(), "sumTechBasicHighScore", -8692608012677382529L);
        setLongField(term97748, term97748.getClass(), "sumTechAdvancedHighScore", -4261164165677849978L);
        setLongField(term97748, term97748.getClass(), "sumTechExpertHighScore", 492467355932744397L);
        setLongField(term97748, term97748.getClass(), "sumTechMasterHighScore", -3909904062778826520L);
        setLongField(term97748, term97748.getClass(), "sumTechLunaticHighScore", 431459361348259677L);
        setLongField(term97748, term97748.getClass(), "sumBattleHighScore", 8927391482405121792L);
        setLongField(term97748, term97748.getClass(), "sumBattleBasicHighScore", 6916093574783329543L);
        setLongField(term97748, term97748.getClass(), "sumBattleAdvancedHighScore", 2626500019350680494L);
        setLongField(term97748, term97748.getClass(), "sumBattleExpertHighScore", -7385996154796124764L);
        setLongField(term97748, term97748.getClass(), "sumBattleMasterHighScore", -3983596883706946405L);
        setLongField(term97748, term97748.getClass(), "sumBattleLunaticHighScore", -5090083476376619601L);
        term97787 = new Integer(-1808514879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term97787;
        callMethod(klass, "setPlayCount", argTypes, term97748, args);
    }

};


