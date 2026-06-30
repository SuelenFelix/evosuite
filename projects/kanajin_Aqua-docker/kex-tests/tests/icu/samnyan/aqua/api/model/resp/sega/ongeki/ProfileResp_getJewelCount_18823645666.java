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

public class ProfileResp_getJewelCount_18823645666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96444;

    public ProfileResp_getJewelCount_18823645666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96444 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96444, term96444.getClass(), "userName", "CoNqscQvsV");
        setIntField(term96444, term96444.getClass(), "level", -677808385);
        setLongField(term96444, term96444.getClass(), "exp", 8046629692203974178L);
        setLongField(term96444, term96444.getClass(), "point", 7977342867375651948L);
        setLongField(term96444, term96444.getClass(), "totalPoint", -6127875256888913472L);
        setIntField(term96444, term96444.getClass(), "playCount", 929572797);
        setIntField(term96444, term96444.getClass(), "jewelCount", -1486456111);
        setIntField(term96444, term96444.getClass(), "totalJewelCount", -373817381);
        setIntField(term96444, term96444.getClass(), "playerRating", -1070271502);
        setIntField(term96444, term96444.getClass(), "highestRating", 282534324);
        setIntField(term96444, term96444.getClass(), "battlePoint", -1522630173);
        setIntField(term96444, term96444.getClass(), "nameplateId", -1174486976);
        setIntField(term96444, term96444.getClass(), "trophyId", 261752801);
        setIntField(term96444, term96444.getClass(), "cardId", 783754337);
        setIntField(term96444, term96444.getClass(), "characterId", 981082669);
        setLongField(term96444, term96444.getClass(), "sumTechHighScore", 3256068873615938705L);
        setLongField(term96444, term96444.getClass(), "sumTechBasicHighScore", 5992533975673253210L);
        setLongField(term96444, term96444.getClass(), "sumTechAdvancedHighScore", -8585140677504195278L);
        setLongField(term96444, term96444.getClass(), "sumTechExpertHighScore", 531813655363085079L);
        setLongField(term96444, term96444.getClass(), "sumTechMasterHighScore", 7424508585687574136L);
        setLongField(term96444, term96444.getClass(), "sumTechLunaticHighScore", -6597239125670473205L);
        setLongField(term96444, term96444.getClass(), "sumBattleHighScore", -8452072070590375950L);
        setLongField(term96444, term96444.getClass(), "sumBattleBasicHighScore", -5208220124363333447L);
        setLongField(term96444, term96444.getClass(), "sumBattleAdvancedHighScore", 8117629111081773240L);
        setLongField(term96444, term96444.getClass(), "sumBattleExpertHighScore", -6364270156186231848L);
        setLongField(term96444, term96444.getClass(), "sumBattleMasterHighScore", 9079628325284052434L);
        setLongField(term96444, term96444.getClass(), "sumBattleLunaticHighScore", 225362301391781209L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJewelCount", argTypes, term96444, args);
    }

};


