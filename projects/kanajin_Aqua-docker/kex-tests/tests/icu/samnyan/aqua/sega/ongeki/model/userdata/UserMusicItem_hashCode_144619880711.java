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

public class UserMusicItem_hashCode_144619880711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5125;

    public UserMusicItem_hashCode_144619880711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5131 = new Long(-4325723315152823407L);
        term5125 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem"));
        Object term5127 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term5129 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term5145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5150 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5160 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5125, term5125.getClass(), "id", 860079646007397083L);
        setLongField(term5127, term5127.getClass(), "id", 3230472384687362867L);
        setLongField(term5129, term5129.getClass(), "id", -1145146470850585022L);
        setField(term5129, term5129.getClass(), "extId", term5131);
        setField(term5129, term5129.getClass(), "luid", "OqbwYQfvAe");
        setIntField(term5146, term5146.getClass(), "year", 2025);
        setShortField(term5146, term5146.getClass(), "month", (short) 3);
        setShortField(term5146, term5146.getClass(), "day", (short) 9);
        setField(term5145, term5145.getClass(), "date", term5146);
        setByteField(term5150, term5150.getClass(), "hour", (byte) 5);
        setByteField(term5150, term5150.getClass(), "minute", (byte) 49);
        setByteField(term5150, term5150.getClass(), "second", (byte) 12);
        setIntField(term5150, term5150.getClass(), "nano", 791695028);
        setField(term5145, term5145.getClass(), "time", term5150);
        setField(term5129, term5129.getClass(), "registerTime", term5145);
        setIntField(term5156, term5156.getClass(), "year", 2023);
        setShortField(term5156, term5156.getClass(), "month", (short) 9);
        setShortField(term5156, term5156.getClass(), "day", (short) 23);
        setField(term5155, term5155.getClass(), "date", term5156);
        setByteField(term5160, term5160.getClass(), "hour", (byte) 12);
        setByteField(term5160, term5160.getClass(), "minute", (byte) 55);
        setByteField(term5160, term5160.getClass(), "second", (byte) 58);
        setIntField(term5160, term5160.getClass(), "nano", 159178396);
        setField(term5155, term5155.getClass(), "time", term5160);
        setField(term5129, term5129.getClass(), "accessTime", term5155);
        setField(term5127, term5127.getClass(), "card", term5129);
        setField(term5127, term5127.getClass(), "userName", "tRxZafjqIx");
        setIntField(term5127, term5127.getClass(), "level", -1553893255);
        setIntField(term5127, term5127.getClass(), "reincarnationNum", 1303442927);
        setLongField(term5127, term5127.getClass(), "exp", 1993646237353405740L);
        setLongField(term5127, term5127.getClass(), "point", -4043093655001688454L);
        setLongField(term5127, term5127.getClass(), "totalPoint", -419800263764810394L);
        setIntField(term5127, term5127.getClass(), "playCount", 794568325);
        setIntField(term5127, term5127.getClass(), "jewelCount", -434468428);
        setIntField(term5127, term5127.getClass(), "totalJewelCount", 1559605714);
        setIntField(term5127, term5127.getClass(), "medalCount", 1146601902);
        setIntField(term5127, term5127.getClass(), "playerRating", -1938881385);
        setIntField(term5127, term5127.getClass(), "highestRating", -1629418973);
        setIntField(term5127, term5127.getClass(), "battlePoint", -100825168);
        setIntField(term5127, term5127.getClass(), "bestBattlePoint", 768407648);
        setIntField(term5127, term5127.getClass(), "overDamageBattlePoint", -350454594);
        setBooleanField(term5127, term5127.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term5127, term5127.getClass(), "nameplateId", -1148142995);
        setIntField(term5127, term5127.getClass(), "trophyId", -233024044);
        setIntField(term5127, term5127.getClass(), "cardId", 1820784228);
        setIntField(term5127, term5127.getClass(), "characterId", 1390820006);
        setIntField(term5127, term5127.getClass(), "characterVoiceNo", -828982065);
        setIntField(term5127, term5127.getClass(), "tabSetting", 1221443226);
        setIntField(term5127, term5127.getClass(), "tabSortSetting", 908108726);
        setIntField(term5127, term5127.getClass(), "cardCategorySetting", 1023209512);
        setIntField(term5127, term5127.getClass(), "cardSortSetting", 1084849225);
        setIntField(term5127, term5127.getClass(), "rivalScoreCategorySetting", -1702055571);
        setIntField(term5127, term5127.getClass(), "playedTutorialBit", -944542900);
        setIntField(term5127, term5127.getClass(), "firstTutorialCancelNum", 2063762142);
        setLongField(term5127, term5127.getClass(), "sumTechHighScore", 5904678961906211249L);
        setLongField(term5127, term5127.getClass(), "sumTechBasicHighScore", -1820639665251914495L);
        setLongField(term5127, term5127.getClass(), "sumTechAdvancedHighScore", 3238645206498300107L);
        setLongField(term5127, term5127.getClass(), "sumTechExpertHighScore", -1592696983130738594L);
        setLongField(term5127, term5127.getClass(), "sumTechMasterHighScore", 6902365338255307910L);
        setLongField(term5127, term5127.getClass(), "sumTechLunaticHighScore", -8019730974733786399L);
        setLongField(term5127, term5127.getClass(), "sumBattleHighScore", 394960377236392159L);
        setLongField(term5127, term5127.getClass(), "sumBattleBasicHighScore", -2955854401507097864L);
        setLongField(term5127, term5127.getClass(), "sumBattleAdvancedHighScore", 329213208496958131L);
        setLongField(term5127, term5127.getClass(), "sumBattleExpertHighScore", 8107921244631636572L);
        setLongField(term5127, term5127.getClass(), "sumBattleMasterHighScore", -7904053112604879960L);
        setLongField(term5127, term5127.getClass(), "sumBattleLunaticHighScore", -6602460430714339690L);
        setField(term5127, term5127.getClass(), "eventWatchedDate", "DhjNLmRMCu");
        setField(term5127, term5127.getClass(), "cmEventWatchedDate", "PgPzMSEjjX");
        setField(term5127, term5127.getClass(), "firstGameId", "wzsPSPcRdj");
        setField(term5127, term5127.getClass(), "firstRomVersion", "kGMQdqJYyB");
        setField(term5127, term5127.getClass(), "firstDataVersion", "XJJNClzHRf");
        setField(term5127, term5127.getClass(), "firstPlayDate", "HDaezxQfQR");
        setField(term5127, term5127.getClass(), "lastGameId", "iikZEapDlu");
        setField(term5127, term5127.getClass(), "lastRomVersion", "nhoHrZfnIN");
        setField(term5127, term5127.getClass(), "lastDataVersion", "ZkMALXpEAZ");
        setField(term5127, term5127.getClass(), "compatibleCmVersion", "tXfQjSqDzN");
        setField(term5127, term5127.getClass(), "lastPlayDate", "BjugTaMcxJ");
        setIntField(term5127, term5127.getClass(), "lastPlaceId", 1658391716);
        setField(term5127, term5127.getClass(), "lastPlaceName", "vGiuZVPJNH");
        setIntField(term5127, term5127.getClass(), "lastRegionId", 2143282300);
        setField(term5127, term5127.getClass(), "lastRegionName", "tlzpzIjMib");
        setIntField(term5127, term5127.getClass(), "lastAllNetId", 1137624258);
        setField(term5127, term5127.getClass(), "lastClientId", "AZdLeSugwv");
        setIntField(term5127, term5127.getClass(), "lastUsedDeckId", 977862393);
        setIntField(term5127, term5127.getClass(), "lastPlayMusicLevel", 301401782);
        setIntField(term5127, term5127.getClass(), "lastEmoneyBrand", 1988605357);
        setField(term5125, term5125.getClass(), "user", term5127);
        setIntField(term5125, term5125.getClass(), "musicId", 808203320);
        setIntField(term5125, term5125.getClass(), "status", -544382127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5125, args);
    }

};


