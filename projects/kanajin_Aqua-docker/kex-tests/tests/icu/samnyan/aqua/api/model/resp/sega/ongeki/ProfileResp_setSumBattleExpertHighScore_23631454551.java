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
import java.lang.Long;

public class ProfileResp_setSumBattleExpertHighScore_23631454551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98717;
     Object term98756;

    public ProfileResp_setSumBattleExpertHighScore_23631454551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98717 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98717, term98717.getClass(), "userName", "xSKFiqFisC");
        setIntField(term98717, term98717.getClass(), "level", -1902403579);
        setLongField(term98717, term98717.getClass(), "exp", 4580986026397521403L);
        setLongField(term98717, term98717.getClass(), "point", -4895149170305055360L);
        setLongField(term98717, term98717.getClass(), "totalPoint", 133828517357949500L);
        setIntField(term98717, term98717.getClass(), "playCount", 1113168734);
        setIntField(term98717, term98717.getClass(), "jewelCount", 1136050907);
        setIntField(term98717, term98717.getClass(), "totalJewelCount", 1335273666);
        setIntField(term98717, term98717.getClass(), "playerRating", -995949019);
        setIntField(term98717, term98717.getClass(), "highestRating", 318420452);
        setIntField(term98717, term98717.getClass(), "battlePoint", 1488172590);
        setIntField(term98717, term98717.getClass(), "nameplateId", 84146422);
        setIntField(term98717, term98717.getClass(), "trophyId", -464584939);
        setIntField(term98717, term98717.getClass(), "cardId", -321206429);
        setIntField(term98717, term98717.getClass(), "characterId", -384265354);
        setLongField(term98717, term98717.getClass(), "sumTechHighScore", 1061508141965683676L);
        setLongField(term98717, term98717.getClass(), "sumTechBasicHighScore", 3123909296078390926L);
        setLongField(term98717, term98717.getClass(), "sumTechAdvancedHighScore", -678762659943476658L);
        setLongField(term98717, term98717.getClass(), "sumTechExpertHighScore", -9090305422882341395L);
        setLongField(term98717, term98717.getClass(), "sumTechMasterHighScore", 7752737690232559172L);
        setLongField(term98717, term98717.getClass(), "sumTechLunaticHighScore", 20348250406112312L);
        setLongField(term98717, term98717.getClass(), "sumBattleHighScore", -7849976618037063561L);
        setLongField(term98717, term98717.getClass(), "sumBattleBasicHighScore", -8606336377218837996L);
        setLongField(term98717, term98717.getClass(), "sumBattleAdvancedHighScore", 1854385752458024304L);
        setLongField(term98717, term98717.getClass(), "sumBattleExpertHighScore", 5116034910258191120L);
        setLongField(term98717, term98717.getClass(), "sumBattleMasterHighScore", 2128565041828444750L);
        setLongField(term98717, term98717.getClass(), "sumBattleLunaticHighScore", -2512394700498847222L);
        term98756 = new Long(6405637973209457093L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98756;
        callMethod(klass, "setSumBattleExpertHighScore", argTypes, term98717, args);
    }

};


