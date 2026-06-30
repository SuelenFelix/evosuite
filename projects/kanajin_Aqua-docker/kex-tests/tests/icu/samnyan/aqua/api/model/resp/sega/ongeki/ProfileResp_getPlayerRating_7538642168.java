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

public class ProfileResp_getPlayerRating_7538642168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96542;

    public ProfileResp_getPlayerRating_7538642168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96542 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96542, term96542.getClass(), "userName", "UmqUFCKiVy");
        setIntField(term96542, term96542.getClass(), "level", 1122290961);
        setLongField(term96542, term96542.getClass(), "exp", -3659440908284951671L);
        setLongField(term96542, term96542.getClass(), "point", -7765047844820629139L);
        setLongField(term96542, term96542.getClass(), "totalPoint", 8383786494956136808L);
        setIntField(term96542, term96542.getClass(), "playCount", -1903611982);
        setIntField(term96542, term96542.getClass(), "jewelCount", -2043306001);
        setIntField(term96542, term96542.getClass(), "totalJewelCount", -712768248);
        setIntField(term96542, term96542.getClass(), "playerRating", 144895148);
        setIntField(term96542, term96542.getClass(), "highestRating", 1616758422);
        setIntField(term96542, term96542.getClass(), "battlePoint", -873454192);
        setIntField(term96542, term96542.getClass(), "nameplateId", 96374277);
        setIntField(term96542, term96542.getClass(), "trophyId", 1493686691);
        setIntField(term96542, term96542.getClass(), "cardId", 1471461800);
        setIntField(term96542, term96542.getClass(), "characterId", 2020118298);
        setLongField(term96542, term96542.getClass(), "sumTechHighScore", 5771210429423801585L);
        setLongField(term96542, term96542.getClass(), "sumTechBasicHighScore", -5863172386644874673L);
        setLongField(term96542, term96542.getClass(), "sumTechAdvancedHighScore", -419663668545840258L);
        setLongField(term96542, term96542.getClass(), "sumTechExpertHighScore", 6945210364634324001L);
        setLongField(term96542, term96542.getClass(), "sumTechMasterHighScore", 6777084224967766719L);
        setLongField(term96542, term96542.getClass(), "sumTechLunaticHighScore", -7827540310243817048L);
        setLongField(term96542, term96542.getClass(), "sumBattleHighScore", 2699582055130560033L);
        setLongField(term96542, term96542.getClass(), "sumBattleBasicHighScore", 4844673580466139355L);
        setLongField(term96542, term96542.getClass(), "sumBattleAdvancedHighScore", -3377436235292018505L);
        setLongField(term96542, term96542.getClass(), "sumBattleExpertHighScore", -2947150639083970205L);
        setLongField(term96542, term96542.getClass(), "sumBattleMasterHighScore", 1665748343853232478L);
        setLongField(term96542, term96542.getClass(), "sumBattleLunaticHighScore", -5806587400708685989L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term96542, args);
    }

};


