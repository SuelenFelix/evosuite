package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_setLastDataVersion_1078228144106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138420;

    public ExternalUserData_setLastDataVersion_1078228144106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138420 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term138420, term138420.getClass(), "accessCode", "BgYFngzOet");
        setField(term138420, term138420.getClass(), "userName", "seKGdIKnET");
        setIntField(term138420, term138420.getClass(), "level", -1716908632);
        setIntField(term138420, term138420.getClass(), "reincarnationNum", 1364701535);
        setLongField(term138420, term138420.getClass(), "exp", -2615890997835585234L);
        setLongField(term138420, term138420.getClass(), "point", -3905346315185615538L);
        setLongField(term138420, term138420.getClass(), "totalPoint", 3491894194579638739L);
        setIntField(term138420, term138420.getClass(), "playCount", 1544289045);
        setIntField(term138420, term138420.getClass(), "jewelCount", -1622152715);
        setIntField(term138420, term138420.getClass(), "totalJewelCount", -205594356);
        setIntField(term138420, term138420.getClass(), "medalCount", 678056629);
        setIntField(term138420, term138420.getClass(), "playerRating", 1559109983);
        setIntField(term138420, term138420.getClass(), "highestRating", -829444841);
        setIntField(term138420, term138420.getClass(), "battlePoint", -2074246809);
        setIntField(term138420, term138420.getClass(), "bestBattlePoint", 1942205813);
        setIntField(term138420, term138420.getClass(), "overDamageBattlePoint", -785227692);
        setIntField(term138420, term138420.getClass(), "nameplateId", -891853241);
        setIntField(term138420, term138420.getClass(), "trophyId", 714477483);
        setIntField(term138420, term138420.getClass(), "cardId", -76361673);
        setIntField(term138420, term138420.getClass(), "characterId", -1961026595);
        setIntField(term138420, term138420.getClass(), "tabSetting", -1749310753);
        setIntField(term138420, term138420.getClass(), "tabSortSetting", 146147621);
        setIntField(term138420, term138420.getClass(), "cardCategorySetting", 1812372275);
        setIntField(term138420, term138420.getClass(), "cardSortSetting", 1058097415);
        setIntField(term138420, term138420.getClass(), "rivalScoreCategorySetting", -287709219);
        setIntField(term138420, term138420.getClass(), "playedTutorialBit", -312998106);
        setIntField(term138420, term138420.getClass(), "firstTutorialCancelNum", 463470872);
        setLongField(term138420, term138420.getClass(), "sumTechHighScore", 6445149623778123895L);
        setLongField(term138420, term138420.getClass(), "sumTechBasicHighScore", 3793986633732699623L);
        setLongField(term138420, term138420.getClass(), "sumTechAdvancedHighScore", 5246154246059901269L);
        setLongField(term138420, term138420.getClass(), "sumTechExpertHighScore", -4611162348118925645L);
        setLongField(term138420, term138420.getClass(), "sumTechMasterHighScore", -7598847400926388498L);
        setLongField(term138420, term138420.getClass(), "sumTechLunaticHighScore", 2167371702942409695L);
        setLongField(term138420, term138420.getClass(), "sumBattleHighScore", -4501597751303720495L);
        setLongField(term138420, term138420.getClass(), "sumBattleBasicHighScore", -4435551729673668914L);
        setLongField(term138420, term138420.getClass(), "sumBattleAdvancedHighScore", 4341869726941866002L);
        setLongField(term138420, term138420.getClass(), "sumBattleExpertHighScore", -6886662246606221239L);
        setLongField(term138420, term138420.getClass(), "sumBattleMasterHighScore", 5268570464606129554L);
        setLongField(term138420, term138420.getClass(), "sumBattleLunaticHighScore", -7094322796907766694L);
        setField(term138420, term138420.getClass(), "eventWatchedDate", "jteyKUPaxv");
        setField(term138420, term138420.getClass(), "cmEventWatchedDate", "UGpJklqpOC");
        setField(term138420, term138420.getClass(), "firstGameId", "wVrgphoKXK");
        setField(term138420, term138420.getClass(), "firstRomVersion", "ApFSyhqdVG");
        setField(term138420, term138420.getClass(), "firstDataVersion", "fqXQjOsGFr");
        setField(term138420, term138420.getClass(), "firstPlayDate", "wwguldydwH");
        setField(term138420, term138420.getClass(), "lastGameId", "MzZiOZqMsS");
        setField(term138420, term138420.getClass(), "lastRomVersion", "KjMVgynLYt");
        setField(term138420, term138420.getClass(), "lastDataVersion", "UgkoUbTbwe");
        setField(term138420, term138420.getClass(), "compatibleCmVersion", "zPAFZXlKLR");
        setField(term138420, term138420.getClass(), "lastPlayDate", "LiqcRerIJM");
        setIntField(term138420, term138420.getClass(), "lastPlaceId", 1711435854);
        setField(term138420, term138420.getClass(), "lastPlaceName", "YQHqvZGKOH");
        setIntField(term138420, term138420.getClass(), "lastRegionId", 656195795);
        setField(term138420, term138420.getClass(), "lastRegionName", "MVWlsxbCSm");
        setIntField(term138420, term138420.getClass(), "lastAllNetId", 1371362533);
        setField(term138420, term138420.getClass(), "lastClientId", "VvmseJJHLX");
        setIntField(term138420, term138420.getClass(), "lastUsedDeckId", -1192130276);
        setIntField(term138420, term138420.getClass(), "lastPlayMusicLevel", -1785851874);
        setIntField(term138420, term138420.getClass(), "lastEmoneyBrand", -809678302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZFkZPtRcYl";
        callMethod(klass, "setLastDataVersion", argTypes, term138420, args);
    }

};


