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

public class UserCard_setExp_3218719325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125230;
     Object term125575;

    public UserCard_setExp_3218719325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term125236 = new Long(-8514728180792822493L);
        term125230 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term125232 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term125234 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term125250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125255 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125260 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125261 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125265 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term125230, term125230.getClass(), "id", -9001085857985006197L);
        setLongField(term125232, term125232.getClass(), "id", 3386460060474051242L);
        setLongField(term125234, term125234.getClass(), "id", -8266266746969170790L);
        setField(term125234, term125234.getClass(), "extId", term125236);
        setField(term125234, term125234.getClass(), "luid", "QCvbbAbluL");
        setIntField(term125251, term125251.getClass(), "year", 2022);
        setShortField(term125251, term125251.getClass(), "month", (short) 6);
        setShortField(term125251, term125251.getClass(), "day", (short) 2);
        setField(term125250, term125250.getClass(), "date", term125251);
        setByteField(term125255, term125255.getClass(), "hour", (byte) 18);
        setByteField(term125255, term125255.getClass(), "minute", (byte) 14);
        setByteField(term125255, term125255.getClass(), "second", (byte) 42);
        setIntField(term125255, term125255.getClass(), "nano", 593545677);
        setField(term125250, term125250.getClass(), "time", term125255);
        setField(term125234, term125234.getClass(), "registerTime", term125250);
        setIntField(term125261, term125261.getClass(), "year", 2010);
        setShortField(term125261, term125261.getClass(), "month", (short) 7);
        setShortField(term125261, term125261.getClass(), "day", (short) 19);
        setField(term125260, term125260.getClass(), "date", term125261);
        setByteField(term125265, term125265.getClass(), "hour", (byte) 16);
        setByteField(term125265, term125265.getClass(), "minute", (byte) 23);
        setByteField(term125265, term125265.getClass(), "second", (byte) 11);
        setIntField(term125265, term125265.getClass(), "nano", 638450755);
        setField(term125260, term125260.getClass(), "time", term125265);
        setField(term125234, term125234.getClass(), "accessTime", term125260);
        setField(term125232, term125232.getClass(), "card", term125234);
        setField(term125232, term125232.getClass(), "userName", "TCfDANoRXy");
        setIntField(term125232, term125232.getClass(), "level", 344294065);
        setIntField(term125232, term125232.getClass(), "reincarnationNum", 1193234010);
        setLongField(term125232, term125232.getClass(), "exp", 4621171198026233729L);
        setLongField(term125232, term125232.getClass(), "point", -6259344762310867961L);
        setLongField(term125232, term125232.getClass(), "totalPoint", 6643877704908948107L);
        setIntField(term125232, term125232.getClass(), "playCount", 988470366);
        setIntField(term125232, term125232.getClass(), "jewelCount", -1015231314);
        setIntField(term125232, term125232.getClass(), "totalJewelCount", 2138487887);
        setIntField(term125232, term125232.getClass(), "medalCount", 1608465153);
        setIntField(term125232, term125232.getClass(), "playerRating", 1367934188);
        setIntField(term125232, term125232.getClass(), "highestRating", -1586790224);
        setIntField(term125232, term125232.getClass(), "battlePoint", 188981994);
        setIntField(term125232, term125232.getClass(), "bestBattlePoint", -1348114075);
        setIntField(term125232, term125232.getClass(), "overDamageBattlePoint", -1005643858);
        setBooleanField(term125232, term125232.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term125232, term125232.getClass(), "nameplateId", 456312486);
        setIntField(term125232, term125232.getClass(), "trophyId", 1799058363);
        setIntField(term125232, term125232.getClass(), "cardId", 216003694);
        setIntField(term125232, term125232.getClass(), "characterId", -1542784975);
        setIntField(term125232, term125232.getClass(), "characterVoiceNo", 1798581458);
        setIntField(term125232, term125232.getClass(), "tabSetting", -151417122);
        setIntField(term125232, term125232.getClass(), "tabSortSetting", -2013771268);
        setIntField(term125232, term125232.getClass(), "cardCategorySetting", 549034622);
        setIntField(term125232, term125232.getClass(), "cardSortSetting", 744233731);
        setIntField(term125232, term125232.getClass(), "rivalScoreCategorySetting", 744742162);
        setIntField(term125232, term125232.getClass(), "playedTutorialBit", 482514787);
        setIntField(term125232, term125232.getClass(), "firstTutorialCancelNum", -1042782085);
        setLongField(term125232, term125232.getClass(), "sumTechHighScore", 1597528360278273509L);
        setLongField(term125232, term125232.getClass(), "sumTechBasicHighScore", -4193514285561915915L);
        setLongField(term125232, term125232.getClass(), "sumTechAdvancedHighScore", 1043993282792596050L);
        setLongField(term125232, term125232.getClass(), "sumTechExpertHighScore", 5980205129723701199L);
        setLongField(term125232, term125232.getClass(), "sumTechMasterHighScore", 5966789048827912119L);
        setLongField(term125232, term125232.getClass(), "sumTechLunaticHighScore", 263127648480062956L);
        setLongField(term125232, term125232.getClass(), "sumBattleHighScore", -2089377678860301491L);
        setLongField(term125232, term125232.getClass(), "sumBattleBasicHighScore", 4363829728740568076L);
        setLongField(term125232, term125232.getClass(), "sumBattleAdvancedHighScore", -8256573426866543134L);
        setLongField(term125232, term125232.getClass(), "sumBattleExpertHighScore", 9139271538227527740L);
        setLongField(term125232, term125232.getClass(), "sumBattleMasterHighScore", -986650053377963812L);
        setLongField(term125232, term125232.getClass(), "sumBattleLunaticHighScore", 2241049114689720701L);
        setField(term125232, term125232.getClass(), "eventWatchedDate", "SNBGphBiIl");
        setField(term125232, term125232.getClass(), "cmEventWatchedDate", "RmHGsfbaBq");
        setField(term125232, term125232.getClass(), "firstGameId", "RSDlfIpFkY");
        setField(term125232, term125232.getClass(), "firstRomVersion", "ZaTowywgws");
        setField(term125232, term125232.getClass(), "firstDataVersion", "XPrRiBUedX");
        setField(term125232, term125232.getClass(), "firstPlayDate", "kultXgiMsw");
        setField(term125232, term125232.getClass(), "lastGameId", "invWIgTrSn");
        setField(term125232, term125232.getClass(), "lastRomVersion", "tdDWYXQBpB");
        setField(term125232, term125232.getClass(), "lastDataVersion", "yLbSZvdjZX");
        setField(term125232, term125232.getClass(), "compatibleCmVersion", "FhCGxrukXm");
        setField(term125232, term125232.getClass(), "lastPlayDate", "KAmjFnlvKU");
        setIntField(term125232, term125232.getClass(), "lastPlaceId", -1231956438);
        setField(term125232, term125232.getClass(), "lastPlaceName", "VKpNTpPbui");
        setIntField(term125232, term125232.getClass(), "lastRegionId", 1392725436);
        setField(term125232, term125232.getClass(), "lastRegionName", "TuzuoEoycc");
        setIntField(term125232, term125232.getClass(), "lastAllNetId", 1678969110);
        setField(term125232, term125232.getClass(), "lastClientId", "LXWldHIZNy");
        setIntField(term125232, term125232.getClass(), "lastUsedDeckId", -312665712);
        setIntField(term125232, term125232.getClass(), "lastPlayMusicLevel", 1022077229);
        setIntField(term125232, term125232.getClass(), "lastEmoneyBrand", -1336430287);
        setField(term125230, term125230.getClass(), "user", term125232);
        setIntField(term125230, term125230.getClass(), "cardId", -1);
        setIntField(term125230, term125230.getClass(), "digitalStock", 1);
        setIntField(term125230, term125230.getClass(), "analogStock", 1614467489);
        setIntField(term125230, term125230.getClass(), "level", 1306583181);
        setIntField(term125230, term125230.getClass(), "maxLevel", 10);
        setIntField(term125230, term125230.getClass(), "exp", -1162066181);
        setIntField(term125230, term125230.getClass(), "printCount", 1058566964);
        setIntField(term125230, term125230.getClass(), "useCount", 349842396);
        setBooleanField(term125230, term125230.getClass(), "isNew", true);
        setField(term125230, term125230.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term125230, term125230.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term125230, term125230.getClass(), "skillId", 1156977610);
        setBooleanField(term125230, term125230.getClass(), "isAcquired", true);
        setField(term125230, term125230.getClass(), "created", "0000-00-00 00:00:00.0");
        term125575 = new Integer(-800343585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term125575;
        callMethod(klass, "setExp", argTypes, term125230, args);
    }

};


