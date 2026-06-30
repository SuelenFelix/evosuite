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

public class UserEventMusic_getTechRecordDate_12887978539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373110;

    public UserEventMusic_getTechRecordDate_12887978539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term373116 = new Long(2984955721798941743L);
        term373110 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term373112 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term373114 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term373130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term373131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term373135 = newInstance(Class.forName("java.time.LocalTime"));
        Object term373140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term373141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term373145 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term373110, term373110.getClass(), "id", 5823346199884805159L);
        setLongField(term373112, term373112.getClass(), "id", 2678122539652150630L);
        setLongField(term373114, term373114.getClass(), "id", 7711838299592817875L);
        setField(term373114, term373114.getClass(), "extId", term373116);
        setField(term373114, term373114.getClass(), "luid", "NsZqgKfECY");
        setIntField(term373131, term373131.getClass(), "year", 2022);
        setShortField(term373131, term373131.getClass(), "month", (short) 9);
        setShortField(term373131, term373131.getClass(), "day", (short) 23);
        setField(term373130, term373130.getClass(), "date", term373131);
        setByteField(term373135, term373135.getClass(), "hour", (byte) 9);
        setByteField(term373135, term373135.getClass(), "minute", (byte) 58);
        setByteField(term373135, term373135.getClass(), "second", (byte) 40);
        setIntField(term373135, term373135.getClass(), "nano", 542827427);
        setField(term373130, term373130.getClass(), "time", term373135);
        setField(term373114, term373114.getClass(), "registerTime", term373130);
        setIntField(term373141, term373141.getClass(), "year", 2011);
        setShortField(term373141, term373141.getClass(), "month", (short) 3);
        setShortField(term373141, term373141.getClass(), "day", (short) 16);
        setField(term373140, term373140.getClass(), "date", term373141);
        setByteField(term373145, term373145.getClass(), "hour", (byte) 16);
        setByteField(term373145, term373145.getClass(), "minute", (byte) 29);
        setByteField(term373145, term373145.getClass(), "second", (byte) 38);
        setIntField(term373145, term373145.getClass(), "nano", 14620604);
        setField(term373140, term373140.getClass(), "time", term373145);
        setField(term373114, term373114.getClass(), "accessTime", term373140);
        setField(term373112, term373112.getClass(), "card", term373114);
        setField(term373112, term373112.getClass(), "userName", "pWyjMBGvBW");
        setIntField(term373112, term373112.getClass(), "level", 1645597060);
        setIntField(term373112, term373112.getClass(), "reincarnationNum", 1948409725);
        setLongField(term373112, term373112.getClass(), "exp", 8583262528808617117L);
        setLongField(term373112, term373112.getClass(), "point", 1980352869080014940L);
        setLongField(term373112, term373112.getClass(), "totalPoint", 3154382347592420616L);
        setIntField(term373112, term373112.getClass(), "playCount", -754667258);
        setIntField(term373112, term373112.getClass(), "jewelCount", -1696812995);
        setIntField(term373112, term373112.getClass(), "totalJewelCount", -468642394);
        setIntField(term373112, term373112.getClass(), "medalCount", 2128530417);
        setIntField(term373112, term373112.getClass(), "playerRating", -1865130242);
        setIntField(term373112, term373112.getClass(), "highestRating", -212464791);
        setIntField(term373112, term373112.getClass(), "battlePoint", -1005079533);
        setIntField(term373112, term373112.getClass(), "bestBattlePoint", 2041457659);
        setIntField(term373112, term373112.getClass(), "overDamageBattlePoint", -647453355);
        setBooleanField(term373112, term373112.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term373112, term373112.getClass(), "nameplateId", 1432017317);
        setIntField(term373112, term373112.getClass(), "trophyId", 1207949622);
        setIntField(term373112, term373112.getClass(), "cardId", 1901251468);
        setIntField(term373112, term373112.getClass(), "characterId", -1139317533);
        setIntField(term373112, term373112.getClass(), "characterVoiceNo", -621332657);
        setIntField(term373112, term373112.getClass(), "tabSetting", -550981857);
        setIntField(term373112, term373112.getClass(), "tabSortSetting", -1196456187);
        setIntField(term373112, term373112.getClass(), "cardCategorySetting", 1172762973);
        setIntField(term373112, term373112.getClass(), "cardSortSetting", 166647527);
        setIntField(term373112, term373112.getClass(), "rivalScoreCategorySetting", 1126509444);
        setIntField(term373112, term373112.getClass(), "playedTutorialBit", -1438049556);
        setIntField(term373112, term373112.getClass(), "firstTutorialCancelNum", -1524057859);
        setLongField(term373112, term373112.getClass(), "sumTechHighScore", -5585344480233463577L);
        setLongField(term373112, term373112.getClass(), "sumTechBasicHighScore", 1433489103573018086L);
        setLongField(term373112, term373112.getClass(), "sumTechAdvancedHighScore", -316100669262154997L);
        setLongField(term373112, term373112.getClass(), "sumTechExpertHighScore", -7324986220120306222L);
        setLongField(term373112, term373112.getClass(), "sumTechMasterHighScore", 8779179458122500791L);
        setLongField(term373112, term373112.getClass(), "sumTechLunaticHighScore", -1641398836852171708L);
        setLongField(term373112, term373112.getClass(), "sumBattleHighScore", 8770874413724832338L);
        setLongField(term373112, term373112.getClass(), "sumBattleBasicHighScore", -4262147678926993571L);
        setLongField(term373112, term373112.getClass(), "sumBattleAdvancedHighScore", 1753403419122593827L);
        setLongField(term373112, term373112.getClass(), "sumBattleExpertHighScore", -5045414661255413277L);
        setLongField(term373112, term373112.getClass(), "sumBattleMasterHighScore", 6632345921556413938L);
        setLongField(term373112, term373112.getClass(), "sumBattleLunaticHighScore", -4565288043141991031L);
        setField(term373112, term373112.getClass(), "eventWatchedDate", "AZErYpbHNK");
        setField(term373112, term373112.getClass(), "cmEventWatchedDate", "hPRBDJXtIm");
        setField(term373112, term373112.getClass(), "firstGameId", "lFpBaNXOGw");
        setField(term373112, term373112.getClass(), "firstRomVersion", "BVcseHqSdy");
        setField(term373112, term373112.getClass(), "firstDataVersion", "JUEqPSnhuB");
        setField(term373112, term373112.getClass(), "firstPlayDate", "ZMWgxxUNDQ");
        setField(term373112, term373112.getClass(), "lastGameId", "SvlZPdLEcQ");
        setField(term373112, term373112.getClass(), "lastRomVersion", "rcsriQScsw");
        setField(term373112, term373112.getClass(), "lastDataVersion", "hmbjaRbJmy");
        setField(term373112, term373112.getClass(), "compatibleCmVersion", "YzSUGIkaWI");
        setField(term373112, term373112.getClass(), "lastPlayDate", "CsjxbNQpvO");
        setIntField(term373112, term373112.getClass(), "lastPlaceId", -1302087195);
        setField(term373112, term373112.getClass(), "lastPlaceName", "UXxQEhADpf");
        setIntField(term373112, term373112.getClass(), "lastRegionId", 1245133320);
        setField(term373112, term373112.getClass(), "lastRegionName", "RqIPVkyMLC");
        setIntField(term373112, term373112.getClass(), "lastAllNetId", -580896036);
        setField(term373112, term373112.getClass(), "lastClientId", "QPOlHAcPRG");
        setIntField(term373112, term373112.getClass(), "lastUsedDeckId", -148618654);
        setIntField(term373112, term373112.getClass(), "lastPlayMusicLevel", -420535610);
        setIntField(term373112, term373112.getClass(), "lastEmoneyBrand", 1977403071);
        setField(term373110, term373110.getClass(), "user", term373112);
        setIntField(term373110, term373110.getClass(), "eventId", -1188977731);
        setIntField(term373110, term373110.getClass(), "type", 64595124);
        setIntField(term373110, term373110.getClass(), "musicId", -1618013081);
        setIntField(term373110, term373110.getClass(), "level", -339448591);
        setIntField(term373110, term373110.getClass(), "techScoreMax", 1586011445);
        setIntField(term373110, term373110.getClass(), "platinumScoreMax", 1118887435);
        setField(term373110, term373110.getClass(), "techRecordDate", "etCBgnrABi");
        setBooleanField(term373110, term373110.getClass(), "isTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTechRecordDate", argTypes, term373110, args);
    }

};


