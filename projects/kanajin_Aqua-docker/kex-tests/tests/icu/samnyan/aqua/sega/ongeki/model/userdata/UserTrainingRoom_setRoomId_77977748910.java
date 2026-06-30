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

public class UserTrainingRoom_setRoomId_77977748910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18044;
     Object term18335;

    public UserTrainingRoom_setRoomId_77977748910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18050 = new Long(-2068172595987555756L);
        term18044 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term18046 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term18048 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term18064 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18065 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18069 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18074 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18075 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18079 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term18044, term18044.getClass(), "id", 5885163998873132588L);
        setLongField(term18046, term18046.getClass(), "id", 2201264121669950608L);
        setLongField(term18048, term18048.getClass(), "id", 4911393165710268247L);
        setField(term18048, term18048.getClass(), "extId", term18050);
        setField(term18048, term18048.getClass(), "luid", "IOddzvEWcl");
        setIntField(term18065, term18065.getClass(), "year", 2021);
        setShortField(term18065, term18065.getClass(), "month", (short) 3);
        setShortField(term18065, term18065.getClass(), "day", (short) 13);
        setField(term18064, term18064.getClass(), "date", term18065);
        setByteField(term18069, term18069.getClass(), "hour", (byte) 6);
        setByteField(term18069, term18069.getClass(), "minute", (byte) 25);
        setByteField(term18069, term18069.getClass(), "second", (byte) 42);
        setIntField(term18069, term18069.getClass(), "nano", 282924199);
        setField(term18064, term18064.getClass(), "time", term18069);
        setField(term18048, term18048.getClass(), "registerTime", term18064);
        setIntField(term18075, term18075.getClass(), "year", 2020);
        setShortField(term18075, term18075.getClass(), "month", (short) 10);
        setShortField(term18075, term18075.getClass(), "day", (short) 25);
        setField(term18074, term18074.getClass(), "date", term18075);
        setByteField(term18079, term18079.getClass(), "hour", (byte) 18);
        setByteField(term18079, term18079.getClass(), "minute", (byte) 22);
        setByteField(term18079, term18079.getClass(), "second", (byte) 30);
        setIntField(term18079, term18079.getClass(), "nano", 948592965);
        setField(term18074, term18074.getClass(), "time", term18079);
        setField(term18048, term18048.getClass(), "accessTime", term18074);
        setField(term18046, term18046.getClass(), "card", term18048);
        setField(term18046, term18046.getClass(), "userName", "bIrtpkYJWT");
        setIntField(term18046, term18046.getClass(), "level", -132005524);
        setIntField(term18046, term18046.getClass(), "reincarnationNum", -1235127374);
        setLongField(term18046, term18046.getClass(), "exp", -836309941570511418L);
        setLongField(term18046, term18046.getClass(), "point", -4851193391918639512L);
        setLongField(term18046, term18046.getClass(), "totalPoint", -7163612258041042650L);
        setIntField(term18046, term18046.getClass(), "playCount", -2077814162);
        setIntField(term18046, term18046.getClass(), "jewelCount", 444514470);
        setIntField(term18046, term18046.getClass(), "totalJewelCount", -147055177);
        setIntField(term18046, term18046.getClass(), "medalCount", 1979044375);
        setIntField(term18046, term18046.getClass(), "playerRating", 961252909);
        setIntField(term18046, term18046.getClass(), "highestRating", 1455842357);
        setIntField(term18046, term18046.getClass(), "battlePoint", 1349806561);
        setIntField(term18046, term18046.getClass(), "bestBattlePoint", 923905351);
        setIntField(term18046, term18046.getClass(), "overDamageBattlePoint", 428360161);
        setBooleanField(term18046, term18046.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term18046, term18046.getClass(), "nameplateId", 631528579);
        setIntField(term18046, term18046.getClass(), "trophyId", -1652091834);
        setIntField(term18046, term18046.getClass(), "cardId", -282021579);
        setIntField(term18046, term18046.getClass(), "characterId", -1652588127);
        setIntField(term18046, term18046.getClass(), "characterVoiceNo", -1902823385);
        setIntField(term18046, term18046.getClass(), "tabSetting", -784924879);
        setIntField(term18046, term18046.getClass(), "tabSortSetting", -1062027102);
        setIntField(term18046, term18046.getClass(), "cardCategorySetting", 1763217806);
        setIntField(term18046, term18046.getClass(), "cardSortSetting", 1644949396);
        setIntField(term18046, term18046.getClass(), "rivalScoreCategorySetting", -2017073245);
        setIntField(term18046, term18046.getClass(), "playedTutorialBit", 522440332);
        setIntField(term18046, term18046.getClass(), "firstTutorialCancelNum", 1516598327);
        setLongField(term18046, term18046.getClass(), "sumTechHighScore", -7186158121023817313L);
        setLongField(term18046, term18046.getClass(), "sumTechBasicHighScore", -8510452367371037137L);
        setLongField(term18046, term18046.getClass(), "sumTechAdvancedHighScore", 2123432481270520381L);
        setLongField(term18046, term18046.getClass(), "sumTechExpertHighScore", 7205698466499430091L);
        setLongField(term18046, term18046.getClass(), "sumTechMasterHighScore", -4868523627266698649L);
        setLongField(term18046, term18046.getClass(), "sumTechLunaticHighScore", 3228082303360203224L);
        setLongField(term18046, term18046.getClass(), "sumBattleHighScore", 8845929725457841487L);
        setLongField(term18046, term18046.getClass(), "sumBattleBasicHighScore", 2599553846982918627L);
        setLongField(term18046, term18046.getClass(), "sumBattleAdvancedHighScore", -4821516944173509228L);
        setLongField(term18046, term18046.getClass(), "sumBattleExpertHighScore", 2315395988604904502L);
        setLongField(term18046, term18046.getClass(), "sumBattleMasterHighScore", 4337555582321907177L);
        setLongField(term18046, term18046.getClass(), "sumBattleLunaticHighScore", -6367418587326372844L);
        setField(term18046, term18046.getClass(), "eventWatchedDate", "VuLLXpvPpZ");
        setField(term18046, term18046.getClass(), "cmEventWatchedDate", "UEdzEKEEEV");
        setField(term18046, term18046.getClass(), "firstGameId", "BcENaQFYSd");
        setField(term18046, term18046.getClass(), "firstRomVersion", "POPYycoDBy");
        setField(term18046, term18046.getClass(), "firstDataVersion", "LuWMOXdAPA");
        setField(term18046, term18046.getClass(), "firstPlayDate", "blSffTnsOv");
        setField(term18046, term18046.getClass(), "lastGameId", "qbUMcIvEXH");
        setField(term18046, term18046.getClass(), "lastRomVersion", "TVxGTjeDcu");
        setField(term18046, term18046.getClass(), "lastDataVersion", "ABPtcyCzkR");
        setField(term18046, term18046.getClass(), "compatibleCmVersion", "QgHhxMyKvr");
        setField(term18046, term18046.getClass(), "lastPlayDate", "VGiXZZTWRO");
        setIntField(term18046, term18046.getClass(), "lastPlaceId", 82353584);
        setField(term18046, term18046.getClass(), "lastPlaceName", "MlPtwXnJOJ");
        setIntField(term18046, term18046.getClass(), "lastRegionId", -758778797);
        setField(term18046, term18046.getClass(), "lastRegionName", "DbfiyFeaTe");
        setIntField(term18046, term18046.getClass(), "lastAllNetId", 765680355);
        setField(term18046, term18046.getClass(), "lastClientId", "dQxXGBtDLZ");
        setIntField(term18046, term18046.getClass(), "lastUsedDeckId", -1012090049);
        setIntField(term18046, term18046.getClass(), "lastPlayMusicLevel", -2025214553);
        setIntField(term18046, term18046.getClass(), "lastEmoneyBrand", -154750730);
        setField(term18044, term18044.getClass(), "user", term18046);
        setField(term18044, term18044.getClass(), "authKey", "EgSgEFIyyN");
        setIntField(term18044, term18044.getClass(), "roomId", -2047179134);
        setIntField(term18044, term18044.getClass(), "cardId", 44908093);
        setField(term18044, term18044.getClass(), "valueDate", "iAOFcXaLSf");
        term18335 = new Integer(887198203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18335;
        callMethod(klass, "setRoomId", argTypes, term18044, args);
    }

};


