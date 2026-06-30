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

public class ProfileResp_getSumTechExpertHighScore_213782583918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97032;

    public ProfileResp_getSumTechExpertHighScore_213782583918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97032 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97032, term97032.getClass(), "userName", "kesqxSdRSJ");
        setIntField(term97032, term97032.getClass(), "level", -343992234);
        setLongField(term97032, term97032.getClass(), "exp", -115390034484396886L);
        setLongField(term97032, term97032.getClass(), "point", -3287880884177946931L);
        setLongField(term97032, term97032.getClass(), "totalPoint", -8637180152381266746L);
        setIntField(term97032, term97032.getClass(), "playCount", -1209672009);
        setIntField(term97032, term97032.getClass(), "jewelCount", 1630634090);
        setIntField(term97032, term97032.getClass(), "totalJewelCount", 795268454);
        setIntField(term97032, term97032.getClass(), "playerRating", 2071423306);
        setIntField(term97032, term97032.getClass(), "highestRating", 1381184751);
        setIntField(term97032, term97032.getClass(), "battlePoint", -119120055);
        setIntField(term97032, term97032.getClass(), "nameplateId", -621482159);
        setIntField(term97032, term97032.getClass(), "trophyId", 1116774402);
        setIntField(term97032, term97032.getClass(), "cardId", -1021057583);
        setIntField(term97032, term97032.getClass(), "characterId", -1675135419);
        setLongField(term97032, term97032.getClass(), "sumTechHighScore", -581400228756073964L);
        setLongField(term97032, term97032.getClass(), "sumTechBasicHighScore", 2287844117902968763L);
        setLongField(term97032, term97032.getClass(), "sumTechAdvancedHighScore", 6878259540912005351L);
        setLongField(term97032, term97032.getClass(), "sumTechExpertHighScore", -6685795678650226734L);
        setLongField(term97032, term97032.getClass(), "sumTechMasterHighScore", 7692335908639437463L);
        setLongField(term97032, term97032.getClass(), "sumTechLunaticHighScore", 3007859086830511081L);
        setLongField(term97032, term97032.getClass(), "sumBattleHighScore", 2299879841219058112L);
        setLongField(term97032, term97032.getClass(), "sumBattleBasicHighScore", -5436291262767823754L);
        setLongField(term97032, term97032.getClass(), "sumBattleAdvancedHighScore", -407857484202759438L);
        setLongField(term97032, term97032.getClass(), "sumBattleExpertHighScore", -6640112612664470324L);
        setLongField(term97032, term97032.getClass(), "sumBattleMasterHighScore", -2303481683520306797L);
        setLongField(term97032, term97032.getClass(), "sumBattleLunaticHighScore", -2466013599161348963L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechExpertHighScore", argTypes, term97032, args);
    }

};


