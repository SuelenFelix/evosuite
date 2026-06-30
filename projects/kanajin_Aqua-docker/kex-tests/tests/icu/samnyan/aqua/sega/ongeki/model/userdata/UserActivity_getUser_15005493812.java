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

public class UserActivity_getUser_15005493812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283586;

    public UserActivity_getUser_15005493812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term283592 = new Long(6044346825617132280L);
        term283586 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term283588 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term283590 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term283606 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283607 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283611 = newInstance(Class.forName("java.time.LocalTime"));
        Object term283616 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283617 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283621 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term283586, term283586.getClass(), "id", 5701103764319411475L);
        setLongField(term283588, term283588.getClass(), "id", -7861025014457514543L);
        setLongField(term283590, term283590.getClass(), "id", 8602193217546485008L);
        setField(term283590, term283590.getClass(), "extId", term283592);
        setField(term283590, term283590.getClass(), "luid", "haGlFmKzph");
        setIntField(term283607, term283607.getClass(), "year", 2014);
        setShortField(term283607, term283607.getClass(), "month", (short) 2);
        setShortField(term283607, term283607.getClass(), "day", (short) 16);
        setField(term283606, term283606.getClass(), "date", term283607);
        setByteField(term283611, term283611.getClass(), "hour", (byte) 2);
        setByteField(term283611, term283611.getClass(), "minute", (byte) 5);
        setByteField(term283611, term283611.getClass(), "second", (byte) 40);
        setIntField(term283611, term283611.getClass(), "nano", 166726202);
        setField(term283606, term283606.getClass(), "time", term283611);
        setField(term283590, term283590.getClass(), "registerTime", term283606);
        setIntField(term283617, term283617.getClass(), "year", 2022);
        setShortField(term283617, term283617.getClass(), "month", (short) 5);
        setShortField(term283617, term283617.getClass(), "day", (short) 25);
        setField(term283616, term283616.getClass(), "date", term283617);
        setByteField(term283621, term283621.getClass(), "hour", (byte) 16);
        setByteField(term283621, term283621.getClass(), "minute", (byte) 4);
        setByteField(term283621, term283621.getClass(), "second", (byte) 53);
        setIntField(term283621, term283621.getClass(), "nano", 716039111);
        setField(term283616, term283616.getClass(), "time", term283621);
        setField(term283590, term283590.getClass(), "accessTime", term283616);
        setField(term283588, term283588.getClass(), "card", term283590);
        setField(term283588, term283588.getClass(), "userName", "FNvjIZLJdX");
        setIntField(term283588, term283588.getClass(), "level", -747334893);
        setIntField(term283588, term283588.getClass(), "reincarnationNum", 1470042937);
        setLongField(term283588, term283588.getClass(), "exp", 8753279309137074862L);
        setLongField(term283588, term283588.getClass(), "point", -1257328542004429773L);
        setLongField(term283588, term283588.getClass(), "totalPoint", 8898884956964145553L);
        setIntField(term283588, term283588.getClass(), "playCount", 1843322163);
        setIntField(term283588, term283588.getClass(), "jewelCount", -1207189934);
        setIntField(term283588, term283588.getClass(), "totalJewelCount", -584179158);
        setIntField(term283588, term283588.getClass(), "medalCount", 659001580);
        setIntField(term283588, term283588.getClass(), "playerRating", -1920579818);
        setIntField(term283588, term283588.getClass(), "highestRating", 830897826);
        setIntField(term283588, term283588.getClass(), "battlePoint", -1718330826);
        setIntField(term283588, term283588.getClass(), "bestBattlePoint", 1554100569);
        setIntField(term283588, term283588.getClass(), "overDamageBattlePoint", 1067721242);
        setBooleanField(term283588, term283588.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term283588, term283588.getClass(), "nameplateId", 263716207);
        setIntField(term283588, term283588.getClass(), "trophyId", -2069127270);
        setIntField(term283588, term283588.getClass(), "cardId", 603147128);
        setIntField(term283588, term283588.getClass(), "characterId", -1408041415);
        setIntField(term283588, term283588.getClass(), "characterVoiceNo", 586059301);
        setIntField(term283588, term283588.getClass(), "tabSetting", 729168621);
        setIntField(term283588, term283588.getClass(), "tabSortSetting", -263302657);
        setIntField(term283588, term283588.getClass(), "cardCategorySetting", 777129818);
        setIntField(term283588, term283588.getClass(), "cardSortSetting", 519921186);
        setIntField(term283588, term283588.getClass(), "rivalScoreCategorySetting", -1237516288);
        setIntField(term283588, term283588.getClass(), "playedTutorialBit", 306022424);
        setIntField(term283588, term283588.getClass(), "firstTutorialCancelNum", 1431819767);
        setLongField(term283588, term283588.getClass(), "sumTechHighScore", 6316876098517877953L);
        setLongField(term283588, term283588.getClass(), "sumTechBasicHighScore", -3542294129226786395L);
        setLongField(term283588, term283588.getClass(), "sumTechAdvancedHighScore", 5157425767534650856L);
        setLongField(term283588, term283588.getClass(), "sumTechExpertHighScore", -5791964257709204313L);
        setLongField(term283588, term283588.getClass(), "sumTechMasterHighScore", 5805272347205079079L);
        setLongField(term283588, term283588.getClass(), "sumTechLunaticHighScore", -8153871845482931218L);
        setLongField(term283588, term283588.getClass(), "sumBattleHighScore", 4045734015081378797L);
        setLongField(term283588, term283588.getClass(), "sumBattleBasicHighScore", -6421623083864583766L);
        setLongField(term283588, term283588.getClass(), "sumBattleAdvancedHighScore", 1890829642465961600L);
        setLongField(term283588, term283588.getClass(), "sumBattleExpertHighScore", -7491977670813076880L);
        setLongField(term283588, term283588.getClass(), "sumBattleMasterHighScore", 492131608826229024L);
        setLongField(term283588, term283588.getClass(), "sumBattleLunaticHighScore", 776206766222428917L);
        setField(term283588, term283588.getClass(), "eventWatchedDate", "gkKANBoKRQ");
        setField(term283588, term283588.getClass(), "cmEventWatchedDate", "nwIfxSYLbH");
        setField(term283588, term283588.getClass(), "firstGameId", "VlbJRuEAoY");
        setField(term283588, term283588.getClass(), "firstRomVersion", "FwbSKnEQVR");
        setField(term283588, term283588.getClass(), "firstDataVersion", "SUIyTSOfNO");
        setField(term283588, term283588.getClass(), "firstPlayDate", "dXdjApLAzK");
        setField(term283588, term283588.getClass(), "lastGameId", "SoglrUcgGE");
        setField(term283588, term283588.getClass(), "lastRomVersion", "rWtaQaTGlL");
        setField(term283588, term283588.getClass(), "lastDataVersion", "cHAyWxkpYO");
        setField(term283588, term283588.getClass(), "compatibleCmVersion", "neHaYsveYy");
        setField(term283588, term283588.getClass(), "lastPlayDate", "jwOOWlBKWZ");
        setIntField(term283588, term283588.getClass(), "lastPlaceId", 2057411208);
        setField(term283588, term283588.getClass(), "lastPlaceName", "LFabroENXN");
        setIntField(term283588, term283588.getClass(), "lastRegionId", -1643323104);
        setField(term283588, term283588.getClass(), "lastRegionName", "xTtWtlUDcE");
        setIntField(term283588, term283588.getClass(), "lastAllNetId", -1959047852);
        setField(term283588, term283588.getClass(), "lastClientId", "zaYpmvkBFb");
        setIntField(term283588, term283588.getClass(), "lastUsedDeckId", 1163144703);
        setIntField(term283588, term283588.getClass(), "lastPlayMusicLevel", -625762476);
        setIntField(term283588, term283588.getClass(), "lastEmoneyBrand", 1063514775);
        setField(term283586, term283586.getClass(), "user", term283588);
        setIntField(term283586, term283586.getClass(), "kind", -1472940834);
        setIntField(term283586, term283586.getClass(), "activityId", -1001789444);
        setIntField(term283586, term283586.getClass(), "sortNumber", -732724305);
        setIntField(term283586, term283586.getClass(), "param1", -1028873607);
        setIntField(term283586, term283586.getClass(), "param2", 315251699);
        setIntField(term283586, term283586.getClass(), "param3", 507924600);
        setIntField(term283586, term283586.getClass(), "param4", -2073979004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term283586, args);
    }

};


