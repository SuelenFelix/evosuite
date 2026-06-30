package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserStory_setStoryId_12691486911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162792;
     Object term163063;

    public UserStory_setStoryId_12691486911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term162798 = new Long(-7001094993638840490L);
        term162792 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term162794 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term162796 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term162812 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162813 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162817 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162822 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162823 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162827 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term162792, term162792.getClass(), "id", -9132321335479092344L);
        setLongField(term162794, term162794.getClass(), "id", -4843588367819860974L);
        setLongField(term162796, term162796.getClass(), "id", -8545138018655256969L);
        setField(term162796, term162796.getClass(), "extId", term162798);
        setField(term162796, term162796.getClass(), "luid", "aymyhPMjnn");
        setIntField(term162813, term162813.getClass(), "year", 2010);
        setShortField(term162813, term162813.getClass(), "month", (short) 3);
        setShortField(term162813, term162813.getClass(), "day", (short) 19);
        setField(term162812, term162812.getClass(), "date", term162813);
        setByteField(term162817, term162817.getClass(), "hour", (byte) 8);
        setByteField(term162817, term162817.getClass(), "minute", (byte) 38);
        setByteField(term162817, term162817.getClass(), "second", (byte) 34);
        setIntField(term162817, term162817.getClass(), "nano", 473897267);
        setField(term162812, term162812.getClass(), "time", term162817);
        setField(term162796, term162796.getClass(), "registerTime", term162812);
        setIntField(term162823, term162823.getClass(), "year", 2023);
        setShortField(term162823, term162823.getClass(), "month", (short) 3);
        setShortField(term162823, term162823.getClass(), "day", (short) 17);
        setField(term162822, term162822.getClass(), "date", term162823);
        setByteField(term162827, term162827.getClass(), "hour", (byte) 13);
        setByteField(term162827, term162827.getClass(), "minute", (byte) 18);
        setByteField(term162827, term162827.getClass(), "second", (byte) 12);
        setIntField(term162827, term162827.getClass(), "nano", 422255508);
        setField(term162822, term162822.getClass(), "time", term162827);
        setField(term162796, term162796.getClass(), "accessTime", term162822);
        setField(term162794, term162794.getClass(), "card", term162796);
        setField(term162794, term162794.getClass(), "userName", "aPlaqiCEzR");
        setIntField(term162794, term162794.getClass(), "level", -34786917);
        setIntField(term162794, term162794.getClass(), "reincarnationNum", 383524147);
        setLongField(term162794, term162794.getClass(), "exp", 8591732307930288390L);
        setLongField(term162794, term162794.getClass(), "point", 9166529803454779143L);
        setLongField(term162794, term162794.getClass(), "totalPoint", 8866183747501835163L);
        setIntField(term162794, term162794.getClass(), "playCount", 1103536027);
        setIntField(term162794, term162794.getClass(), "jewelCount", -387893846);
        setIntField(term162794, term162794.getClass(), "totalJewelCount", -297741338);
        setIntField(term162794, term162794.getClass(), "medalCount", 206404549);
        setIntField(term162794, term162794.getClass(), "playerRating", 1164079567);
        setIntField(term162794, term162794.getClass(), "highestRating", 808653750);
        setIntField(term162794, term162794.getClass(), "battlePoint", -1440143802);
        setIntField(term162794, term162794.getClass(), "bestBattlePoint", 2128836583);
        setIntField(term162794, term162794.getClass(), "overDamageBattlePoint", 1644897809);
        setBooleanField(term162794, term162794.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term162794, term162794.getClass(), "nameplateId", 1814048906);
        setIntField(term162794, term162794.getClass(), "trophyId", -113356049);
        setIntField(term162794, term162794.getClass(), "cardId", 1523433206);
        setIntField(term162794, term162794.getClass(), "characterId", -353002245);
        setIntField(term162794, term162794.getClass(), "characterVoiceNo", 1307822619);
        setIntField(term162794, term162794.getClass(), "tabSetting", -1218971646);
        setIntField(term162794, term162794.getClass(), "tabSortSetting", 1826082446);
        setIntField(term162794, term162794.getClass(), "cardCategorySetting", 683436217);
        setIntField(term162794, term162794.getClass(), "cardSortSetting", -453252097);
        setIntField(term162794, term162794.getClass(), "rivalScoreCategorySetting", 881546219);
        setIntField(term162794, term162794.getClass(), "playedTutorialBit", 1102295833);
        setIntField(term162794, term162794.getClass(), "firstTutorialCancelNum", -1680086509);
        setLongField(term162794, term162794.getClass(), "sumTechHighScore", 1356686635320246830L);
        setLongField(term162794, term162794.getClass(), "sumTechBasicHighScore", 220986449734641173L);
        setLongField(term162794, term162794.getClass(), "sumTechAdvancedHighScore", 5817982950792619847L);
        setLongField(term162794, term162794.getClass(), "sumTechExpertHighScore", 8035056509253472342L);
        setLongField(term162794, term162794.getClass(), "sumTechMasterHighScore", -7845710797851074028L);
        setLongField(term162794, term162794.getClass(), "sumTechLunaticHighScore", -328735576020644988L);
        setLongField(term162794, term162794.getClass(), "sumBattleHighScore", 2251966990954160391L);
        setLongField(term162794, term162794.getClass(), "sumBattleBasicHighScore", 8975054707060898793L);
        setLongField(term162794, term162794.getClass(), "sumBattleAdvancedHighScore", 2299517237819028412L);
        setLongField(term162794, term162794.getClass(), "sumBattleExpertHighScore", 309557317875107099L);
        setLongField(term162794, term162794.getClass(), "sumBattleMasterHighScore", -5619840835933174326L);
        setLongField(term162794, term162794.getClass(), "sumBattleLunaticHighScore", -773633018194637732L);
        setField(term162794, term162794.getClass(), "eventWatchedDate", "upFIfXmPHr");
        setField(term162794, term162794.getClass(), "cmEventWatchedDate", "yWkVkdyYbu");
        setField(term162794, term162794.getClass(), "firstGameId", "HKfJtemhMV");
        setField(term162794, term162794.getClass(), "firstRomVersion", "GFuTvYNJGi");
        setField(term162794, term162794.getClass(), "firstDataVersion", "JgUbvEJCOI");
        setField(term162794, term162794.getClass(), "firstPlayDate", "ILpMVHBxyt");
        setField(term162794, term162794.getClass(), "lastGameId", "horZwJhkMz");
        setField(term162794, term162794.getClass(), "lastRomVersion", "arxpTGARuO");
        setField(term162794, term162794.getClass(), "lastDataVersion", "WJTTZvfEje");
        setField(term162794, term162794.getClass(), "compatibleCmVersion", "JcubNxEOPJ");
        setField(term162794, term162794.getClass(), "lastPlayDate", "DZwNgsnbSX");
        setIntField(term162794, term162794.getClass(), "lastPlaceId", -1490853348);
        setField(term162794, term162794.getClass(), "lastPlaceName", "rEnEFWzeqA");
        setIntField(term162794, term162794.getClass(), "lastRegionId", 78992394);
        setField(term162794, term162794.getClass(), "lastRegionName", "hanonyiyFw");
        setIntField(term162794, term162794.getClass(), "lastAllNetId", 1142528937);
        setField(term162794, term162794.getClass(), "lastClientId", "lDCUhJvbkD");
        setIntField(term162794, term162794.getClass(), "lastUsedDeckId", 1315223978);
        setIntField(term162794, term162794.getClass(), "lastPlayMusicLevel", -2027183455);
        setIntField(term162794, term162794.getClass(), "lastEmoneyBrand", -1018926699);
        setField(term162792, term162792.getClass(), "user", term162794);
        setIntField(term162792, term162792.getClass(), "storyId", 1764513543);
        setIntField(term162792, term162792.getClass(), "lastChapterId", 697622913);
        setIntField(term162792, term162792.getClass(), "jewelCount", -1907956934);
        setIntField(term162792, term162792.getClass(), "lastPlayMusicId", -1932506949);
        setIntField(term162792, term162792.getClass(), "lastPlayMusicCategory", -1191178740);
        setIntField(term162792, term162792.getClass(), "lastPlayMusicLevel", -1072911681);
        term163063 = new Integer(237096319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term163063;
        callMethod(klass, "setStoryId", argTypes, term162792, args);
    }

};


