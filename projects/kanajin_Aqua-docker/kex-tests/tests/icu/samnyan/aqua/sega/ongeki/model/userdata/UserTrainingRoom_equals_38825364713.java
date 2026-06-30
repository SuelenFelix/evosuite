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

public class UserTrainingRoom_equals_38825364713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19483;
     Object term19774;

    public UserTrainingRoom_equals_38825364713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19489 = new Long(4784595517102746672L);
        term19483 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term19485 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term19487 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term19503 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19508 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19514 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19518 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term19483, term19483.getClass(), "id", -2097210721190032076L);
        setLongField(term19485, term19485.getClass(), "id", -3022442322233520981L);
        setLongField(term19487, term19487.getClass(), "id", -8735757853649335051L);
        setField(term19487, term19487.getClass(), "extId", term19489);
        setField(term19487, term19487.getClass(), "luid", "AdYzLPMcwe");
        setIntField(term19504, term19504.getClass(), "year", 2023);
        setShortField(term19504, term19504.getClass(), "month", (short) 5);
        setShortField(term19504, term19504.getClass(), "day", (short) 23);
        setField(term19503, term19503.getClass(), "date", term19504);
        setByteField(term19508, term19508.getClass(), "hour", (byte) 0);
        setByteField(term19508, term19508.getClass(), "minute", (byte) 50);
        setByteField(term19508, term19508.getClass(), "second", (byte) 5);
        setIntField(term19508, term19508.getClass(), "nano", 296286825);
        setField(term19503, term19503.getClass(), "time", term19508);
        setField(term19487, term19487.getClass(), "registerTime", term19503);
        setIntField(term19514, term19514.getClass(), "year", 2015);
        setShortField(term19514, term19514.getClass(), "month", (short) 2);
        setShortField(term19514, term19514.getClass(), "day", (short) 5);
        setField(term19513, term19513.getClass(), "date", term19514);
        setByteField(term19518, term19518.getClass(), "hour", (byte) 3);
        setByteField(term19518, term19518.getClass(), "minute", (byte) 26);
        setByteField(term19518, term19518.getClass(), "second", (byte) 49);
        setIntField(term19518, term19518.getClass(), "nano", 995758570);
        setField(term19513, term19513.getClass(), "time", term19518);
        setField(term19487, term19487.getClass(), "accessTime", term19513);
        setField(term19485, term19485.getClass(), "card", term19487);
        setField(term19485, term19485.getClass(), "userName", "FrTZLybkKk");
        setIntField(term19485, term19485.getClass(), "level", -1305898281);
        setIntField(term19485, term19485.getClass(), "reincarnationNum", 140501130);
        setLongField(term19485, term19485.getClass(), "exp", 7016651719770171901L);
        setLongField(term19485, term19485.getClass(), "point", 7777131569376571611L);
        setLongField(term19485, term19485.getClass(), "totalPoint", -2792969772767139843L);
        setIntField(term19485, term19485.getClass(), "playCount", -1458890291);
        setIntField(term19485, term19485.getClass(), "jewelCount", 1016087323);
        setIntField(term19485, term19485.getClass(), "totalJewelCount", 1957748979);
        setIntField(term19485, term19485.getClass(), "medalCount", -1290093259);
        setIntField(term19485, term19485.getClass(), "playerRating", -1200934890);
        setIntField(term19485, term19485.getClass(), "highestRating", 1765633108);
        setIntField(term19485, term19485.getClass(), "battlePoint", 1312888741);
        setIntField(term19485, term19485.getClass(), "bestBattlePoint", -1443680397);
        setIntField(term19485, term19485.getClass(), "overDamageBattlePoint", -1331169079);
        setBooleanField(term19485, term19485.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term19485, term19485.getClass(), "nameplateId", 1109050836);
        setIntField(term19485, term19485.getClass(), "trophyId", 1978065000);
        setIntField(term19485, term19485.getClass(), "cardId", -2121133707);
        setIntField(term19485, term19485.getClass(), "characterId", -1005498887);
        setIntField(term19485, term19485.getClass(), "characterVoiceNo", 1329150584);
        setIntField(term19485, term19485.getClass(), "tabSetting", -1825382367);
        setIntField(term19485, term19485.getClass(), "tabSortSetting", -1791371074);
        setIntField(term19485, term19485.getClass(), "cardCategorySetting", -1151122332);
        setIntField(term19485, term19485.getClass(), "cardSortSetting", 953387911);
        setIntField(term19485, term19485.getClass(), "rivalScoreCategorySetting", -1550025613);
        setIntField(term19485, term19485.getClass(), "playedTutorialBit", 814617314);
        setIntField(term19485, term19485.getClass(), "firstTutorialCancelNum", -159489307);
        setLongField(term19485, term19485.getClass(), "sumTechHighScore", 6313343355456678206L);
        setLongField(term19485, term19485.getClass(), "sumTechBasicHighScore", -8901826621860118061L);
        setLongField(term19485, term19485.getClass(), "sumTechAdvancedHighScore", 2947576061864407618L);
        setLongField(term19485, term19485.getClass(), "sumTechExpertHighScore", 7265006047025305787L);
        setLongField(term19485, term19485.getClass(), "sumTechMasterHighScore", -3323049156110984575L);
        setLongField(term19485, term19485.getClass(), "sumTechLunaticHighScore", -9079706905309751984L);
        setLongField(term19485, term19485.getClass(), "sumBattleHighScore", -2080067238602928154L);
        setLongField(term19485, term19485.getClass(), "sumBattleBasicHighScore", 8202413349907503373L);
        setLongField(term19485, term19485.getClass(), "sumBattleAdvancedHighScore", 4715419421865334491L);
        setLongField(term19485, term19485.getClass(), "sumBattleExpertHighScore", 6320559761926095887L);
        setLongField(term19485, term19485.getClass(), "sumBattleMasterHighScore", 5067793047038594982L);
        setLongField(term19485, term19485.getClass(), "sumBattleLunaticHighScore", -1572808624189549793L);
        setField(term19485, term19485.getClass(), "eventWatchedDate", "FlxVmiMYKP");
        setField(term19485, term19485.getClass(), "cmEventWatchedDate", "fgOpAWlGYN");
        setField(term19485, term19485.getClass(), "firstGameId", "PNzNzzjSXM");
        setField(term19485, term19485.getClass(), "firstRomVersion", "ktKcSZiuGM");
        setField(term19485, term19485.getClass(), "firstDataVersion", "PSOttyUeqv");
        setField(term19485, term19485.getClass(), "firstPlayDate", "HmEvTlmzXo");
        setField(term19485, term19485.getClass(), "lastGameId", "BMMonTIZgJ");
        setField(term19485, term19485.getClass(), "lastRomVersion", "QXyFXBjFde");
        setField(term19485, term19485.getClass(), "lastDataVersion", "xVFgeyYxZS");
        setField(term19485, term19485.getClass(), "compatibleCmVersion", "iQiGTulJiH");
        setField(term19485, term19485.getClass(), "lastPlayDate", "utCuuVCKqE");
        setIntField(term19485, term19485.getClass(), "lastPlaceId", 1317020952);
        setField(term19485, term19485.getClass(), "lastPlaceName", "zSfoqzJbPT");
        setIntField(term19485, term19485.getClass(), "lastRegionId", -742710703);
        setField(term19485, term19485.getClass(), "lastRegionName", "QUymMnsCIj");
        setIntField(term19485, term19485.getClass(), "lastAllNetId", -355505521);
        setField(term19485, term19485.getClass(), "lastClientId", "ikTtOgdVYS");
        setIntField(term19485, term19485.getClass(), "lastUsedDeckId", 1227316523);
        setIntField(term19485, term19485.getClass(), "lastPlayMusicLevel", -58633039);
        setIntField(term19485, term19485.getClass(), "lastEmoneyBrand", 448061908);
        setField(term19483, term19483.getClass(), "user", term19485);
        setField(term19483, term19483.getClass(), "authKey", "JptuwlirlS");
        setIntField(term19483, term19483.getClass(), "roomId", -1268483887);
        setIntField(term19483, term19483.getClass(), "cardId", -1929689681);
        setField(term19483, term19483.getClass(), "valueDate", "TKOMaGswbU");
        term19774 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term19774;
        callMethod(klass, "equals", argTypes, term19483, args);
    }

};


