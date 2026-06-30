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

public class ExternalUserData_getRivalScoreCategorySetting_71159577926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3174520;

    public ExternalUserData_getRivalScoreCategorySetting_71159577926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3174520 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3174520, term3174520.getClass(), "accessCode", "WpMvqDOViC");
        setField(term3174520, term3174520.getClass(), "userName", "MdQaDaOzgz");
        setIntField(term3174520, term3174520.getClass(), "level", 1509061378);
        setIntField(term3174520, term3174520.getClass(), "reincarnationNum", 1366093518);
        setLongField(term3174520, term3174520.getClass(), "exp", -8744238979542545509L);
        setLongField(term3174520, term3174520.getClass(), "point", -2620725654329177959L);
        setLongField(term3174520, term3174520.getClass(), "totalPoint", -2063634916062981451L);
        setIntField(term3174520, term3174520.getClass(), "playCount", 239978584);
        setIntField(term3174520, term3174520.getClass(), "jewelCount", 578177250);
        setIntField(term3174520, term3174520.getClass(), "totalJewelCount", -1656636903);
        setIntField(term3174520, term3174520.getClass(), "medalCount", -546300051);
        setIntField(term3174520, term3174520.getClass(), "playerRating", -111859894);
        setIntField(term3174520, term3174520.getClass(), "highestRating", -693316649);
        setIntField(term3174520, term3174520.getClass(), "battlePoint", 731068232);
        setIntField(term3174520, term3174520.getClass(), "bestBattlePoint", -1495588327);
        setIntField(term3174520, term3174520.getClass(), "overDamageBattlePoint", 1071743674);
        setIntField(term3174520, term3174520.getClass(), "nameplateId", 1143737357);
        setIntField(term3174520, term3174520.getClass(), "trophyId", -1859337860);
        setIntField(term3174520, term3174520.getClass(), "cardId", 614301321);
        setIntField(term3174520, term3174520.getClass(), "characterId", -836582727);
        setIntField(term3174520, term3174520.getClass(), "tabSetting", -1166594669);
        setIntField(term3174520, term3174520.getClass(), "tabSortSetting", 1680258829);
        setIntField(term3174520, term3174520.getClass(), "cardCategorySetting", 1667684911);
        setIntField(term3174520, term3174520.getClass(), "cardSortSetting", 1304723565);
        setIntField(term3174520, term3174520.getClass(), "rivalScoreCategorySetting", 1711213460);
        setIntField(term3174520, term3174520.getClass(), "playedTutorialBit", 1809310239);
        setIntField(term3174520, term3174520.getClass(), "firstTutorialCancelNum", -134672690);
        setLongField(term3174520, term3174520.getClass(), "sumTechHighScore", -1984587970076222807L);
        setLongField(term3174520, term3174520.getClass(), "sumTechBasicHighScore", -5951616376938661234L);
        setLongField(term3174520, term3174520.getClass(), "sumTechAdvancedHighScore", 7771385967405885485L);
        setLongField(term3174520, term3174520.getClass(), "sumTechExpertHighScore", -1655157825183601918L);
        setLongField(term3174520, term3174520.getClass(), "sumTechMasterHighScore", -3259262093987338637L);
        setLongField(term3174520, term3174520.getClass(), "sumTechLunaticHighScore", 4770813091606069968L);
        setLongField(term3174520, term3174520.getClass(), "sumBattleHighScore", -8970908366849612780L);
        setLongField(term3174520, term3174520.getClass(), "sumBattleBasicHighScore", -3042500071337051267L);
        setLongField(term3174520, term3174520.getClass(), "sumBattleAdvancedHighScore", 5966157591160940921L);
        setLongField(term3174520, term3174520.getClass(), "sumBattleExpertHighScore", 7881756155837097848L);
        setLongField(term3174520, term3174520.getClass(), "sumBattleMasterHighScore", 2677184482645597600L);
        setLongField(term3174520, term3174520.getClass(), "sumBattleLunaticHighScore", 8093356498042728062L);
        setField(term3174520, term3174520.getClass(), "eventWatchedDate", "giAuwrYAwH");
        setField(term3174520, term3174520.getClass(), "cmEventWatchedDate", "ScjvpaJYvI");
        setField(term3174520, term3174520.getClass(), "firstGameId", "tjJTVZcRKX");
        setField(term3174520, term3174520.getClass(), "firstRomVersion", "XIZPYARjuN");
        setField(term3174520, term3174520.getClass(), "firstDataVersion", "WrdajqEChz");
        setField(term3174520, term3174520.getClass(), "firstPlayDate", "TtBuIhhmuI");
        setField(term3174520, term3174520.getClass(), "lastGameId", "jaKhRoqKwm");
        setField(term3174520, term3174520.getClass(), "lastRomVersion", "TEIzPGuqnN");
        setField(term3174520, term3174520.getClass(), "lastDataVersion", "zGgRxrlqXe");
        setField(term3174520, term3174520.getClass(), "compatibleCmVersion", "diEojeBHSY");
        setField(term3174520, term3174520.getClass(), "lastPlayDate", "qZscHXjnIz");
        setIntField(term3174520, term3174520.getClass(), "lastPlaceId", 2107284243);
        setField(term3174520, term3174520.getClass(), "lastPlaceName", "YJiDMAddgC");
        setIntField(term3174520, term3174520.getClass(), "lastRegionId", -1976624368);
        setField(term3174520, term3174520.getClass(), "lastRegionName", "vMIXDgMjsO");
        setIntField(term3174520, term3174520.getClass(), "lastAllNetId", 99663691);
        setField(term3174520, term3174520.getClass(), "lastClientId", "TXFESgicae");
        setIntField(term3174520, term3174520.getClass(), "lastUsedDeckId", -429091250);
        setIntField(term3174520, term3174520.getClass(), "lastPlayMusicLevel", -2011981498);
        setIntField(term3174520, term3174520.getClass(), "lastEmoneyBrand", -1238108977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRivalScoreCategorySetting", argTypes, term3174520, args);
    }

};


