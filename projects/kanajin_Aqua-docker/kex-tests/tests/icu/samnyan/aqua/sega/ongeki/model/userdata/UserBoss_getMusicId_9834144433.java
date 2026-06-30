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

public class UserBoss_getMusicId_9834144433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135008;

    public UserBoss_getMusicId_9834144433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term135014 = new Long(-8477368071089201577L);
        term135008 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term135010 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term135012 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term135028 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135029 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135033 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135038 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135039 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135043 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term135008, term135008.getClass(), "id", -7998661215550946748L);
        setLongField(term135010, term135010.getClass(), "id", 6579956953652710845L);
        setLongField(term135012, term135012.getClass(), "id", 2885707146638475602L);
        setField(term135012, term135012.getClass(), "extId", term135014);
        setField(term135012, term135012.getClass(), "luid", "xlERWkGbKr");
        setIntField(term135029, term135029.getClass(), "year", 2010);
        setShortField(term135029, term135029.getClass(), "month", (short) 7);
        setShortField(term135029, term135029.getClass(), "day", (short) 15);
        setField(term135028, term135028.getClass(), "date", term135029);
        setByteField(term135033, term135033.getClass(), "hour", (byte) 10);
        setByteField(term135033, term135033.getClass(), "minute", (byte) 47);
        setByteField(term135033, term135033.getClass(), "second", (byte) 0);
        setIntField(term135033, term135033.getClass(), "nano", 513170187);
        setField(term135028, term135028.getClass(), "time", term135033);
        setField(term135012, term135012.getClass(), "registerTime", term135028);
        setIntField(term135039, term135039.getClass(), "year", 2022);
        setShortField(term135039, term135039.getClass(), "month", (short) 3);
        setShortField(term135039, term135039.getClass(), "day", (short) 1);
        setField(term135038, term135038.getClass(), "date", term135039);
        setByteField(term135043, term135043.getClass(), "hour", (byte) 15);
        setByteField(term135043, term135043.getClass(), "minute", (byte) 32);
        setByteField(term135043, term135043.getClass(), "second", (byte) 30);
        setIntField(term135043, term135043.getClass(), "nano", 406959223);
        setField(term135038, term135038.getClass(), "time", term135043);
        setField(term135012, term135012.getClass(), "accessTime", term135038);
        setField(term135010, term135010.getClass(), "card", term135012);
        setField(term135010, term135010.getClass(), "userName", "QvJNEroCUL");
        setIntField(term135010, term135010.getClass(), "level", -93440765);
        setIntField(term135010, term135010.getClass(), "reincarnationNum", -1763224766);
        setLongField(term135010, term135010.getClass(), "exp", -6159099825404879597L);
        setLongField(term135010, term135010.getClass(), "point", -285246490074609556L);
        setLongField(term135010, term135010.getClass(), "totalPoint", -1019381823485948838L);
        setIntField(term135010, term135010.getClass(), "playCount", -966554344);
        setIntField(term135010, term135010.getClass(), "jewelCount", 1485859505);
        setIntField(term135010, term135010.getClass(), "totalJewelCount", 1422308934);
        setIntField(term135010, term135010.getClass(), "medalCount", -1843770627);
        setIntField(term135010, term135010.getClass(), "playerRating", -1984599794);
        setIntField(term135010, term135010.getClass(), "highestRating", 1410893442);
        setIntField(term135010, term135010.getClass(), "battlePoint", -1557544397);
        setIntField(term135010, term135010.getClass(), "bestBattlePoint", 1050498492);
        setIntField(term135010, term135010.getClass(), "overDamageBattlePoint", -14998881);
        setBooleanField(term135010, term135010.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term135010, term135010.getClass(), "nameplateId", 1913259662);
        setIntField(term135010, term135010.getClass(), "trophyId", -181084778);
        setIntField(term135010, term135010.getClass(), "cardId", -558822921);
        setIntField(term135010, term135010.getClass(), "characterId", -445796317);
        setIntField(term135010, term135010.getClass(), "characterVoiceNo", -75307754);
        setIntField(term135010, term135010.getClass(), "tabSetting", 1208875748);
        setIntField(term135010, term135010.getClass(), "tabSortSetting", -353170573);
        setIntField(term135010, term135010.getClass(), "cardCategorySetting", -1071939679);
        setIntField(term135010, term135010.getClass(), "cardSortSetting", -1530369051);
        setIntField(term135010, term135010.getClass(), "rivalScoreCategorySetting", -538048936);
        setIntField(term135010, term135010.getClass(), "playedTutorialBit", 359927439);
        setIntField(term135010, term135010.getClass(), "firstTutorialCancelNum", -671786602);
        setLongField(term135010, term135010.getClass(), "sumTechHighScore", -3669839592969655578L);
        setLongField(term135010, term135010.getClass(), "sumTechBasicHighScore", -5410939940602789819L);
        setLongField(term135010, term135010.getClass(), "sumTechAdvancedHighScore", 9096924556400079954L);
        setLongField(term135010, term135010.getClass(), "sumTechExpertHighScore", -6878742158421702861L);
        setLongField(term135010, term135010.getClass(), "sumTechMasterHighScore", 6197648590174536301L);
        setLongField(term135010, term135010.getClass(), "sumTechLunaticHighScore", -4397303209604980812L);
        setLongField(term135010, term135010.getClass(), "sumBattleHighScore", -3643205801227265734L);
        setLongField(term135010, term135010.getClass(), "sumBattleBasicHighScore", 7791656219202642763L);
        setLongField(term135010, term135010.getClass(), "sumBattleAdvancedHighScore", -2833400668761303697L);
        setLongField(term135010, term135010.getClass(), "sumBattleExpertHighScore", -3086013854840792715L);
        setLongField(term135010, term135010.getClass(), "sumBattleMasterHighScore", 2899271849959072016L);
        setLongField(term135010, term135010.getClass(), "sumBattleLunaticHighScore", -4006853614846118166L);
        setField(term135010, term135010.getClass(), "eventWatchedDate", "CpfLVqPiil");
        setField(term135010, term135010.getClass(), "cmEventWatchedDate", "LmFOclAgbf");
        setField(term135010, term135010.getClass(), "firstGameId", "nYfzbXugsB");
        setField(term135010, term135010.getClass(), "firstRomVersion", "qRQNawdehr");
        setField(term135010, term135010.getClass(), "firstDataVersion", "SQzxKDMlfO");
        setField(term135010, term135010.getClass(), "firstPlayDate", "aKrsHDKAga");
        setField(term135010, term135010.getClass(), "lastGameId", "rKYDoRiKpS");
        setField(term135010, term135010.getClass(), "lastRomVersion", "XGYvAaNOfz");
        setField(term135010, term135010.getClass(), "lastDataVersion", "xVIwdmzmFH");
        setField(term135010, term135010.getClass(), "compatibleCmVersion", "ZUWrlRmxmN");
        setField(term135010, term135010.getClass(), "lastPlayDate", "GHfTuIOuRe");
        setIntField(term135010, term135010.getClass(), "lastPlaceId", -51390011);
        setField(term135010, term135010.getClass(), "lastPlaceName", "uTLqPiiyQJ");
        setIntField(term135010, term135010.getClass(), "lastRegionId", 1988464734);
        setField(term135010, term135010.getClass(), "lastRegionName", "ZpBdJcjcRV");
        setIntField(term135010, term135010.getClass(), "lastAllNetId", 1205484765);
        setField(term135010, term135010.getClass(), "lastClientId", "WmcYBwydRb");
        setIntField(term135010, term135010.getClass(), "lastUsedDeckId", 1721773044);
        setIntField(term135010, term135010.getClass(), "lastPlayMusicLevel", -915969228);
        setIntField(term135010, term135010.getClass(), "lastEmoneyBrand", 1880570421);
        setField(term135008, term135008.getClass(), "user", term135010);
        setIntField(term135008, term135008.getClass(), "musicId", 1550634740);
        setIntField(term135008, term135008.getClass(), "damage", 1948909933);
        setBooleanField(term135008, term135008.getClass(), "isClear", true);
        setIntField(term135008, term135008.getClass(), "eventId", 523942487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term135008, args);
    }

};


