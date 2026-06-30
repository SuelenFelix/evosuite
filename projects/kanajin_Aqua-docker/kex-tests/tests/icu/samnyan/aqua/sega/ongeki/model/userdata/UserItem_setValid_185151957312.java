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
import java.lang.Boolean;

public class UserItem_setValid_185151957312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108161;
     Object term108430;

    public UserItem_setValid_185151957312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term108167 = new Long(-4867941246533901410L);
        term108161 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term108163 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term108165 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term108181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108186 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108196 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term108161, term108161.getClass(), "id", 67297291437512138L);
        setLongField(term108163, term108163.getClass(), "id", 69996779158165739L);
        setLongField(term108165, term108165.getClass(), "id", 4580340243842493522L);
        setField(term108165, term108165.getClass(), "extId", term108167);
        setField(term108165, term108165.getClass(), "luid", "eXHygaZKkI");
        setIntField(term108182, term108182.getClass(), "year", 2023);
        setShortField(term108182, term108182.getClass(), "month", (short) 3);
        setShortField(term108182, term108182.getClass(), "day", (short) 9);
        setField(term108181, term108181.getClass(), "date", term108182);
        setByteField(term108186, term108186.getClass(), "hour", (byte) 0);
        setByteField(term108186, term108186.getClass(), "minute", (byte) 39);
        setByteField(term108186, term108186.getClass(), "second", (byte) 8);
        setIntField(term108186, term108186.getClass(), "nano", 231503726);
        setField(term108181, term108181.getClass(), "time", term108186);
        setField(term108165, term108165.getClass(), "registerTime", term108181);
        setIntField(term108192, term108192.getClass(), "year", 2018);
        setShortField(term108192, term108192.getClass(), "month", (short) 4);
        setShortField(term108192, term108192.getClass(), "day", (short) 18);
        setField(term108191, term108191.getClass(), "date", term108192);
        setByteField(term108196, term108196.getClass(), "hour", (byte) 12);
        setByteField(term108196, term108196.getClass(), "minute", (byte) 26);
        setByteField(term108196, term108196.getClass(), "second", (byte) 54);
        setIntField(term108196, term108196.getClass(), "nano", 499786988);
        setField(term108191, term108191.getClass(), "time", term108196);
        setField(term108165, term108165.getClass(), "accessTime", term108191);
        setField(term108163, term108163.getClass(), "card", term108165);
        setField(term108163, term108163.getClass(), "userName", "exVBhDpyTv");
        setIntField(term108163, term108163.getClass(), "level", 392977323);
        setIntField(term108163, term108163.getClass(), "reincarnationNum", -794722040);
        setLongField(term108163, term108163.getClass(), "exp", -1625831289038141207L);
        setLongField(term108163, term108163.getClass(), "point", -7000667548383213429L);
        setLongField(term108163, term108163.getClass(), "totalPoint", -3253560450442374829L);
        setIntField(term108163, term108163.getClass(), "playCount", 464722569);
        setIntField(term108163, term108163.getClass(), "jewelCount", -12715882);
        setIntField(term108163, term108163.getClass(), "totalJewelCount", -1629082667);
        setIntField(term108163, term108163.getClass(), "medalCount", 1938805252);
        setIntField(term108163, term108163.getClass(), "playerRating", 892926651);
        setIntField(term108163, term108163.getClass(), "highestRating", 324394779);
        setIntField(term108163, term108163.getClass(), "battlePoint", 1334207398);
        setIntField(term108163, term108163.getClass(), "bestBattlePoint", 1899917071);
        setIntField(term108163, term108163.getClass(), "overDamageBattlePoint", 2010556609);
        setBooleanField(term108163, term108163.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term108163, term108163.getClass(), "nameplateId", -328864713);
        setIntField(term108163, term108163.getClass(), "trophyId", -624310741);
        setIntField(term108163, term108163.getClass(), "cardId", -336930851);
        setIntField(term108163, term108163.getClass(), "characterId", 1850349935);
        setIntField(term108163, term108163.getClass(), "characterVoiceNo", -1353579264);
        setIntField(term108163, term108163.getClass(), "tabSetting", -1995862281);
        setIntField(term108163, term108163.getClass(), "tabSortSetting", -64331464);
        setIntField(term108163, term108163.getClass(), "cardCategorySetting", 1814821269);
        setIntField(term108163, term108163.getClass(), "cardSortSetting", -2035330261);
        setIntField(term108163, term108163.getClass(), "rivalScoreCategorySetting", -839111848);
        setIntField(term108163, term108163.getClass(), "playedTutorialBit", 1712179237);
        setIntField(term108163, term108163.getClass(), "firstTutorialCancelNum", -2122863540);
        setLongField(term108163, term108163.getClass(), "sumTechHighScore", -7540005515538581749L);
        setLongField(term108163, term108163.getClass(), "sumTechBasicHighScore", 3565805916956388720L);
        setLongField(term108163, term108163.getClass(), "sumTechAdvancedHighScore", -7562475576016795087L);
        setLongField(term108163, term108163.getClass(), "sumTechExpertHighScore", 8817641592906331084L);
        setLongField(term108163, term108163.getClass(), "sumTechMasterHighScore", 2177564740292018865L);
        setLongField(term108163, term108163.getClass(), "sumTechLunaticHighScore", 5124901050413407326L);
        setLongField(term108163, term108163.getClass(), "sumBattleHighScore", -4360385289366619057L);
        setLongField(term108163, term108163.getClass(), "sumBattleBasicHighScore", 6908305230258570476L);
        setLongField(term108163, term108163.getClass(), "sumBattleAdvancedHighScore", -6815212117503532310L);
        setLongField(term108163, term108163.getClass(), "sumBattleExpertHighScore", -5790105864407935058L);
        setLongField(term108163, term108163.getClass(), "sumBattleMasterHighScore", 1959847205925516219L);
        setLongField(term108163, term108163.getClass(), "sumBattleLunaticHighScore", 927728800002406449L);
        setField(term108163, term108163.getClass(), "eventWatchedDate", "HIROkhxmYq");
        setField(term108163, term108163.getClass(), "cmEventWatchedDate", "IOCISrBpxa");
        setField(term108163, term108163.getClass(), "firstGameId", "xYPVdJYlie");
        setField(term108163, term108163.getClass(), "firstRomVersion", "ReKmMCwzEQ");
        setField(term108163, term108163.getClass(), "firstDataVersion", "tNcYNTIZXy");
        setField(term108163, term108163.getClass(), "firstPlayDate", "XntyZLMPel");
        setField(term108163, term108163.getClass(), "lastGameId", "kRYwILGOiG");
        setField(term108163, term108163.getClass(), "lastRomVersion", "lGzUITCYwf");
        setField(term108163, term108163.getClass(), "lastDataVersion", "OOTylmfCYh");
        setField(term108163, term108163.getClass(), "compatibleCmVersion", "tDqwvIixso");
        setField(term108163, term108163.getClass(), "lastPlayDate", "liEYQdFeWW");
        setIntField(term108163, term108163.getClass(), "lastPlaceId", -811923755);
        setField(term108163, term108163.getClass(), "lastPlaceName", "ADqXMyhBwX");
        setIntField(term108163, term108163.getClass(), "lastRegionId", -353643828);
        setField(term108163, term108163.getClass(), "lastRegionName", "bxkUNyUzCb");
        setIntField(term108163, term108163.getClass(), "lastAllNetId", -632794298);
        setField(term108163, term108163.getClass(), "lastClientId", "lyiWNZdiRp");
        setIntField(term108163, term108163.getClass(), "lastUsedDeckId", -530294126);
        setIntField(term108163, term108163.getClass(), "lastPlayMusicLevel", 798290048);
        setIntField(term108163, term108163.getClass(), "lastEmoneyBrand", 383365811);
        setField(term108161, term108161.getClass(), "user", term108163);
        setIntField(term108161, term108161.getClass(), "itemKind", 140322430);
        setIntField(term108161, term108161.getClass(), "itemId", -1492719591);
        setIntField(term108161, term108161.getClass(), "stock", 2077964123);
        setBooleanField(term108161, term108161.getClass(), "isValid", false);
        term108430 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term108430;
        callMethod(klass, "setValid", argTypes, term108161, args);
    }

};


