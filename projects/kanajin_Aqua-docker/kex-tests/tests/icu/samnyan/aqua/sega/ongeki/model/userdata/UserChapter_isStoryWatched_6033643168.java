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

public class UserChapter_isStoryWatched_6033643168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86661;

    public UserChapter_isStoryWatched_6033643168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term86667 = new Long(6698455537431331246L);
        term86661 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term86663 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term86665 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term86681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86686 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86696 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term86661, term86661.getClass(), "id", 6589609175802101180L);
        setLongField(term86663, term86663.getClass(), "id", -2504382987386570729L);
        setLongField(term86665, term86665.getClass(), "id", 520896091063818935L);
        setField(term86665, term86665.getClass(), "extId", term86667);
        setField(term86665, term86665.getClass(), "luid", "PzNtQwCbTD");
        setIntField(term86682, term86682.getClass(), "year", 2021);
        setShortField(term86682, term86682.getClass(), "month", (short) 5);
        setShortField(term86682, term86682.getClass(), "day", (short) 13);
        setField(term86681, term86681.getClass(), "date", term86682);
        setByteField(term86686, term86686.getClass(), "hour", (byte) 15);
        setByteField(term86686, term86686.getClass(), "minute", (byte) 40);
        setByteField(term86686, term86686.getClass(), "second", (byte) 27);
        setIntField(term86686, term86686.getClass(), "nano", 319035378);
        setField(term86681, term86681.getClass(), "time", term86686);
        setField(term86665, term86665.getClass(), "registerTime", term86681);
        setIntField(term86692, term86692.getClass(), "year", 2012);
        setShortField(term86692, term86692.getClass(), "month", (short) 5);
        setShortField(term86692, term86692.getClass(), "day", (short) 21);
        setField(term86691, term86691.getClass(), "date", term86692);
        setByteField(term86696, term86696.getClass(), "hour", (byte) 19);
        setByteField(term86696, term86696.getClass(), "minute", (byte) 56);
        setByteField(term86696, term86696.getClass(), "second", (byte) 3);
        setIntField(term86696, term86696.getClass(), "nano", 266247153);
        setField(term86691, term86691.getClass(), "time", term86696);
        setField(term86665, term86665.getClass(), "accessTime", term86691);
        setField(term86663, term86663.getClass(), "card", term86665);
        setField(term86663, term86663.getClass(), "userName", "wQAefimNLh");
        setIntField(term86663, term86663.getClass(), "level", 2121003177);
        setIntField(term86663, term86663.getClass(), "reincarnationNum", 1093708386);
        setLongField(term86663, term86663.getClass(), "exp", -7763535196525474654L);
        setLongField(term86663, term86663.getClass(), "point", -304098044779776461L);
        setLongField(term86663, term86663.getClass(), "totalPoint", 5045856503514343478L);
        setIntField(term86663, term86663.getClass(), "playCount", 1609837057);
        setIntField(term86663, term86663.getClass(), "jewelCount", 895453282);
        setIntField(term86663, term86663.getClass(), "totalJewelCount", -1488970453);
        setIntField(term86663, term86663.getClass(), "medalCount", -289323354);
        setIntField(term86663, term86663.getClass(), "playerRating", 1649025249);
        setIntField(term86663, term86663.getClass(), "highestRating", -937498214);
        setIntField(term86663, term86663.getClass(), "battlePoint", 1605317373);
        setIntField(term86663, term86663.getClass(), "bestBattlePoint", 904392784);
        setIntField(term86663, term86663.getClass(), "overDamageBattlePoint", -165829430);
        setBooleanField(term86663, term86663.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term86663, term86663.getClass(), "nameplateId", -206826041);
        setIntField(term86663, term86663.getClass(), "trophyId", -866061427);
        setIntField(term86663, term86663.getClass(), "cardId", 1628734156);
        setIntField(term86663, term86663.getClass(), "characterId", -578890556);
        setIntField(term86663, term86663.getClass(), "characterVoiceNo", 2129122634);
        setIntField(term86663, term86663.getClass(), "tabSetting", 382196976);
        setIntField(term86663, term86663.getClass(), "tabSortSetting", 506884160);
        setIntField(term86663, term86663.getClass(), "cardCategorySetting", 347846893);
        setIntField(term86663, term86663.getClass(), "cardSortSetting", -1522343998);
        setIntField(term86663, term86663.getClass(), "rivalScoreCategorySetting", -514980586);
        setIntField(term86663, term86663.getClass(), "playedTutorialBit", 1857474216);
        setIntField(term86663, term86663.getClass(), "firstTutorialCancelNum", -53071149);
        setLongField(term86663, term86663.getClass(), "sumTechHighScore", -1793258933453544024L);
        setLongField(term86663, term86663.getClass(), "sumTechBasicHighScore", -3474751564535185716L);
        setLongField(term86663, term86663.getClass(), "sumTechAdvancedHighScore", 3013432206371270776L);
        setLongField(term86663, term86663.getClass(), "sumTechExpertHighScore", -6757564870085101374L);
        setLongField(term86663, term86663.getClass(), "sumTechMasterHighScore", -3649984910149412233L);
        setLongField(term86663, term86663.getClass(), "sumTechLunaticHighScore", 7593602767052909314L);
        setLongField(term86663, term86663.getClass(), "sumBattleHighScore", 7009846690732806829L);
        setLongField(term86663, term86663.getClass(), "sumBattleBasicHighScore", 8159301017712143715L);
        setLongField(term86663, term86663.getClass(), "sumBattleAdvancedHighScore", 7716553209665440346L);
        setLongField(term86663, term86663.getClass(), "sumBattleExpertHighScore", 2104945851697951566L);
        setLongField(term86663, term86663.getClass(), "sumBattleMasterHighScore", 2226274535113455673L);
        setLongField(term86663, term86663.getClass(), "sumBattleLunaticHighScore", -3483009961035969884L);
        setField(term86663, term86663.getClass(), "eventWatchedDate", "NDFbtxRRgi");
        setField(term86663, term86663.getClass(), "cmEventWatchedDate", "vasBXGWtux");
        setField(term86663, term86663.getClass(), "firstGameId", "UfUIICYJWk");
        setField(term86663, term86663.getClass(), "firstRomVersion", "vuGxdvURpp");
        setField(term86663, term86663.getClass(), "firstDataVersion", "zUgAERZZFZ");
        setField(term86663, term86663.getClass(), "firstPlayDate", "QhkdVFKaoy");
        setField(term86663, term86663.getClass(), "lastGameId", "WCQDPwVjsS");
        setField(term86663, term86663.getClass(), "lastRomVersion", "XkZOYFvTGI");
        setField(term86663, term86663.getClass(), "lastDataVersion", "NifhlBZIDF");
        setField(term86663, term86663.getClass(), "compatibleCmVersion", "vKEgtSbaYp");
        setField(term86663, term86663.getClass(), "lastPlayDate", "FnjEwOlAkC");
        setIntField(term86663, term86663.getClass(), "lastPlaceId", -2041534507);
        setField(term86663, term86663.getClass(), "lastPlaceName", "ZsGqLnRMml");
        setIntField(term86663, term86663.getClass(), "lastRegionId", 2090333247);
        setField(term86663, term86663.getClass(), "lastRegionName", "BTXsqJgjjs");
        setIntField(term86663, term86663.getClass(), "lastAllNetId", 1612944193);
        setField(term86663, term86663.getClass(), "lastClientId", "OjFRpvsLzi");
        setIntField(term86663, term86663.getClass(), "lastUsedDeckId", 1274552070);
        setIntField(term86663, term86663.getClass(), "lastPlayMusicLevel", 701800239);
        setIntField(term86663, term86663.getClass(), "lastEmoneyBrand", -1208601938);
        setField(term86661, term86661.getClass(), "user", term86663);
        setIntField(term86661, term86661.getClass(), "chapterId", -1949786069);
        setIntField(term86661, term86661.getClass(), "jewelCount", -1357939737);
        setIntField(term86661, term86661.getClass(), "lastPlayMusicCategory", 1032926922);
        setIntField(term86661, term86661.getClass(), "lastPlayMusicId", -478839397);
        setIntField(term86661, term86661.getClass(), "lastPlayMusicLevel", -266762167);
        setBooleanField(term86661, term86661.getClass(), "isStoryWatched", true);
        setBooleanField(term86661, term86661.getClass(), "isClear", true);
        setIntField(term86661, term86661.getClass(), "skipTiming1", -1341806138);
        setIntField(term86661, term86661.getClass(), "skipTiming2", 684728176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStoryWatched", argTypes, term86661, args);
    }

};


