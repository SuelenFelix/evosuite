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

public class UserCard_equals_71184836234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130420;
     Object term130765;

    public UserCard_equals_71184836234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term130426 = new Long(3713624957161771816L);
        term130420 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term130422 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term130424 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term130440 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130441 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130445 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130450 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130451 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130455 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term130420, term130420.getClass(), "id", -2585664336595587057L);
        setLongField(term130422, term130422.getClass(), "id", 708577904419371317L);
        setLongField(term130424, term130424.getClass(), "id", -2690892774856443185L);
        setField(term130424, term130424.getClass(), "extId", term130426);
        setField(term130424, term130424.getClass(), "luid", "JySfuJQGCc");
        setIntField(term130441, term130441.getClass(), "year", 2014);
        setShortField(term130441, term130441.getClass(), "month", (short) 1);
        setShortField(term130441, term130441.getClass(), "day", (short) 23);
        setField(term130440, term130440.getClass(), "date", term130441);
        setByteField(term130445, term130445.getClass(), "hour", (byte) 19);
        setByteField(term130445, term130445.getClass(), "minute", (byte) 10);
        setByteField(term130445, term130445.getClass(), "second", (byte) 5);
        setIntField(term130445, term130445.getClass(), "nano", 522099168);
        setField(term130440, term130440.getClass(), "time", term130445);
        setField(term130424, term130424.getClass(), "registerTime", term130440);
        setIntField(term130451, term130451.getClass(), "year", 2024);
        setShortField(term130451, term130451.getClass(), "month", (short) 11);
        setShortField(term130451, term130451.getClass(), "day", (short) 12);
        setField(term130450, term130450.getClass(), "date", term130451);
        setByteField(term130455, term130455.getClass(), "hour", (byte) 7);
        setByteField(term130455, term130455.getClass(), "minute", (byte) 0);
        setByteField(term130455, term130455.getClass(), "second", (byte) 20);
        setIntField(term130455, term130455.getClass(), "nano", 646827761);
        setField(term130450, term130450.getClass(), "time", term130455);
        setField(term130424, term130424.getClass(), "accessTime", term130450);
        setField(term130422, term130422.getClass(), "card", term130424);
        setField(term130422, term130422.getClass(), "userName", "EYFlXZZTDu");
        setIntField(term130422, term130422.getClass(), "level", 214661063);
        setIntField(term130422, term130422.getClass(), "reincarnationNum", -1712764742);
        setLongField(term130422, term130422.getClass(), "exp", 5840859821340657308L);
        setLongField(term130422, term130422.getClass(), "point", -2964890560184632056L);
        setLongField(term130422, term130422.getClass(), "totalPoint", 6284569223648453852L);
        setIntField(term130422, term130422.getClass(), "playCount", 1102291792);
        setIntField(term130422, term130422.getClass(), "jewelCount", -1173378523);
        setIntField(term130422, term130422.getClass(), "totalJewelCount", 1809390829);
        setIntField(term130422, term130422.getClass(), "medalCount", 1035721712);
        setIntField(term130422, term130422.getClass(), "playerRating", 714222306);
        setIntField(term130422, term130422.getClass(), "highestRating", -483982962);
        setIntField(term130422, term130422.getClass(), "battlePoint", -1731721170);
        setIntField(term130422, term130422.getClass(), "bestBattlePoint", 893978926);
        setIntField(term130422, term130422.getClass(), "overDamageBattlePoint", -1002898053);
        setBooleanField(term130422, term130422.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term130422, term130422.getClass(), "nameplateId", -938480312);
        setIntField(term130422, term130422.getClass(), "trophyId", -1755694249);
        setIntField(term130422, term130422.getClass(), "cardId", -730526942);
        setIntField(term130422, term130422.getClass(), "characterId", 1596741735);
        setIntField(term130422, term130422.getClass(), "characterVoiceNo", -992293515);
        setIntField(term130422, term130422.getClass(), "tabSetting", -941799505);
        setIntField(term130422, term130422.getClass(), "tabSortSetting", -490855781);
        setIntField(term130422, term130422.getClass(), "cardCategorySetting", -1019146708);
        setIntField(term130422, term130422.getClass(), "cardSortSetting", -1659254800);
        setIntField(term130422, term130422.getClass(), "rivalScoreCategorySetting", 1069040713);
        setIntField(term130422, term130422.getClass(), "playedTutorialBit", -932319157);
        setIntField(term130422, term130422.getClass(), "firstTutorialCancelNum", 2096486142);
        setLongField(term130422, term130422.getClass(), "sumTechHighScore", 7341410165383593995L);
        setLongField(term130422, term130422.getClass(), "sumTechBasicHighScore", -1143229323203489703L);
        setLongField(term130422, term130422.getClass(), "sumTechAdvancedHighScore", -8058542459723783498L);
        setLongField(term130422, term130422.getClass(), "sumTechExpertHighScore", 931611916636362363L);
        setLongField(term130422, term130422.getClass(), "sumTechMasterHighScore", 7873519520560250356L);
        setLongField(term130422, term130422.getClass(), "sumTechLunaticHighScore", 3511799974299727829L);
        setLongField(term130422, term130422.getClass(), "sumBattleHighScore", -8893421215306756727L);
        setLongField(term130422, term130422.getClass(), "sumBattleBasicHighScore", 9176480824270735497L);
        setLongField(term130422, term130422.getClass(), "sumBattleAdvancedHighScore", -233935289040920305L);
        setLongField(term130422, term130422.getClass(), "sumBattleExpertHighScore", -7836074308578692375L);
        setLongField(term130422, term130422.getClass(), "sumBattleMasterHighScore", -3089824536577926853L);
        setLongField(term130422, term130422.getClass(), "sumBattleLunaticHighScore", 3636819316680245346L);
        setField(term130422, term130422.getClass(), "eventWatchedDate", "DRGzFlWxaV");
        setField(term130422, term130422.getClass(), "cmEventWatchedDate", "ZyTXwKjtvO");
        setField(term130422, term130422.getClass(), "firstGameId", "mrIomiQpXW");
        setField(term130422, term130422.getClass(), "firstRomVersion", "mDIAdszXHc");
        setField(term130422, term130422.getClass(), "firstDataVersion", "GYljRejWKI");
        setField(term130422, term130422.getClass(), "firstPlayDate", "AwXWFyuuXB");
        setField(term130422, term130422.getClass(), "lastGameId", "hHUEukVMwn");
        setField(term130422, term130422.getClass(), "lastRomVersion", "yvAOmWOExs");
        setField(term130422, term130422.getClass(), "lastDataVersion", "DmsJwEkQmO");
        setField(term130422, term130422.getClass(), "compatibleCmVersion", "HzibsEDFOp");
        setField(term130422, term130422.getClass(), "lastPlayDate", "nxccuKoVbt");
        setIntField(term130422, term130422.getClass(), "lastPlaceId", 1814053301);
        setField(term130422, term130422.getClass(), "lastPlaceName", "fgSbKLymzA");
        setIntField(term130422, term130422.getClass(), "lastRegionId", -1145940584);
        setField(term130422, term130422.getClass(), "lastRegionName", "kSFJgZpdtf");
        setIntField(term130422, term130422.getClass(), "lastAllNetId", 1759520462);
        setField(term130422, term130422.getClass(), "lastClientId", "ujNUCJKMUq");
        setIntField(term130422, term130422.getClass(), "lastUsedDeckId", -450055049);
        setIntField(term130422, term130422.getClass(), "lastPlayMusicLevel", -2139747712);
        setIntField(term130422, term130422.getClass(), "lastEmoneyBrand", -60712376);
        setField(term130420, term130420.getClass(), "user", term130422);
        setIntField(term130420, term130420.getClass(), "cardId", -1);
        setIntField(term130420, term130420.getClass(), "digitalStock", 1);
        setIntField(term130420, term130420.getClass(), "analogStock", 1374935274);
        setIntField(term130420, term130420.getClass(), "level", 1063935111);
        setIntField(term130420, term130420.getClass(), "maxLevel", 10);
        setIntField(term130420, term130420.getClass(), "exp", 1742675635);
        setIntField(term130420, term130420.getClass(), "printCount", 1406898507);
        setIntField(term130420, term130420.getClass(), "useCount", -28514280);
        setBooleanField(term130420, term130420.getClass(), "isNew", true);
        setField(term130420, term130420.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term130420, term130420.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term130420, term130420.getClass(), "skillId", 313319336);
        setBooleanField(term130420, term130420.getClass(), "isAcquired", true);
        setField(term130420, term130420.getClass(), "created", "0000-00-00 00:00:00.0");
        term130765 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term130765;
        callMethod(klass, "equals", argTypes, term130420, args);
    }

};


