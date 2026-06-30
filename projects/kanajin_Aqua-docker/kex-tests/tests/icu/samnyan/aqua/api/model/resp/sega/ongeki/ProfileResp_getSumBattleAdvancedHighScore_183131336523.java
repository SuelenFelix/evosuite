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

public class ProfileResp_getSumBattleAdvancedHighScore_183131336523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97277;

    public ProfileResp_getSumBattleAdvancedHighScore_183131336523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97277 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97277, term97277.getClass(), "userName", "zxcdzyDZux");
        setIntField(term97277, term97277.getClass(), "level", 207796039);
        setLongField(term97277, term97277.getClass(), "exp", -2039415660848937066L);
        setLongField(term97277, term97277.getClass(), "point", -5288308497989947812L);
        setLongField(term97277, term97277.getClass(), "totalPoint", -7824771278445605005L);
        setIntField(term97277, term97277.getClass(), "playCount", 482718320);
        setIntField(term97277, term97277.getClass(), "jewelCount", 1197661458);
        setIntField(term97277, term97277.getClass(), "totalJewelCount", -135355755);
        setIntField(term97277, term97277.getClass(), "playerRating", -1168887285);
        setIntField(term97277, term97277.getClass(), "highestRating", 1296171970);
        setIntField(term97277, term97277.getClass(), "battlePoint", -59993795);
        setIntField(term97277, term97277.getClass(), "nameplateId", 687119281);
        setIntField(term97277, term97277.getClass(), "trophyId", 1512533066);
        setIntField(term97277, term97277.getClass(), "cardId", 1656172743);
        setIntField(term97277, term97277.getClass(), "characterId", -967813515);
        setLongField(term97277, term97277.getClass(), "sumTechHighScore", 3924227041181820339L);
        setLongField(term97277, term97277.getClass(), "sumTechBasicHighScore", 6299628643468364230L);
        setLongField(term97277, term97277.getClass(), "sumTechAdvancedHighScore", -3437796750132882567L);
        setLongField(term97277, term97277.getClass(), "sumTechExpertHighScore", -8883327576327176872L);
        setLongField(term97277, term97277.getClass(), "sumTechMasterHighScore", 545211381451685619L);
        setLongField(term97277, term97277.getClass(), "sumTechLunaticHighScore", -1424170915126137744L);
        setLongField(term97277, term97277.getClass(), "sumBattleHighScore", -7090976603783369130L);
        setLongField(term97277, term97277.getClass(), "sumBattleBasicHighScore", 2105547361973674685L);
        setLongField(term97277, term97277.getClass(), "sumBattleAdvancedHighScore", 5193414351788523845L);
        setLongField(term97277, term97277.getClass(), "sumBattleExpertHighScore", -7203259019783668358L);
        setLongField(term97277, term97277.getClass(), "sumBattleMasterHighScore", -5482859863685894248L);
        setLongField(term97277, term97277.getClass(), "sumBattleLunaticHighScore", -1774467958123998772L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleAdvancedHighScore", argTypes, term97277, args);
    }

};


