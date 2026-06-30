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

public class UserCharacter_getId_3215107341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168164;

    public UserCharacter_getId_3215107341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term168170 = new Long(3731931947533293029L);
        term168164 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term168166 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term168168 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term168184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168189 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168199 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term168164, term168164.getClass(), "id", -8383951510031878518L);
        setLongField(term168166, term168166.getClass(), "id", -5592861993594218992L);
        setLongField(term168168, term168168.getClass(), "id", -7307957496922433051L);
        setField(term168168, term168168.getClass(), "extId", term168170);
        setField(term168168, term168168.getClass(), "luid", "DzpjyfzuLi");
        setIntField(term168185, term168185.getClass(), "year", 2017);
        setShortField(term168185, term168185.getClass(), "month", (short) 2);
        setShortField(term168185, term168185.getClass(), "day", (short) 9);
        setField(term168184, term168184.getClass(), "date", term168185);
        setByteField(term168189, term168189.getClass(), "hour", (byte) 16);
        setByteField(term168189, term168189.getClass(), "minute", (byte) 11);
        setByteField(term168189, term168189.getClass(), "second", (byte) 59);
        setIntField(term168189, term168189.getClass(), "nano", 660290526);
        setField(term168184, term168184.getClass(), "time", term168189);
        setField(term168168, term168168.getClass(), "registerTime", term168184);
        setIntField(term168195, term168195.getClass(), "year", 2013);
        setShortField(term168195, term168195.getClass(), "month", (short) 8);
        setShortField(term168195, term168195.getClass(), "day", (short) 19);
        setField(term168194, term168194.getClass(), "date", term168195);
        setByteField(term168199, term168199.getClass(), "hour", (byte) 23);
        setByteField(term168199, term168199.getClass(), "minute", (byte) 0);
        setByteField(term168199, term168199.getClass(), "second", (byte) 13);
        setIntField(term168199, term168199.getClass(), "nano", 134992386);
        setField(term168194, term168194.getClass(), "time", term168199);
        setField(term168168, term168168.getClass(), "accessTime", term168194);
        setField(term168166, term168166.getClass(), "card", term168168);
        setField(term168166, term168166.getClass(), "userName", "HaqsDSnFiE");
        setIntField(term168166, term168166.getClass(), "level", -284767862);
        setIntField(term168166, term168166.getClass(), "reincarnationNum", 1346515345);
        setLongField(term168166, term168166.getClass(), "exp", -8573375024113271710L);
        setLongField(term168166, term168166.getClass(), "point", -5466314644855449620L);
        setLongField(term168166, term168166.getClass(), "totalPoint", -1608345939535109455L);
        setIntField(term168166, term168166.getClass(), "playCount", 2132293781);
        setIntField(term168166, term168166.getClass(), "jewelCount", 1025837124);
        setIntField(term168166, term168166.getClass(), "totalJewelCount", -1875484532);
        setIntField(term168166, term168166.getClass(), "medalCount", 2142478049);
        setIntField(term168166, term168166.getClass(), "playerRating", 2085104036);
        setIntField(term168166, term168166.getClass(), "highestRating", 136979507);
        setIntField(term168166, term168166.getClass(), "battlePoint", -27834494);
        setIntField(term168166, term168166.getClass(), "bestBattlePoint", -470460903);
        setIntField(term168166, term168166.getClass(), "overDamageBattlePoint", -1476214738);
        setBooleanField(term168166, term168166.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term168166, term168166.getClass(), "nameplateId", -1898771379);
        setIntField(term168166, term168166.getClass(), "trophyId", -1950750332);
        setIntField(term168166, term168166.getClass(), "cardId", 98744131);
        setIntField(term168166, term168166.getClass(), "characterId", 1076913386);
        setIntField(term168166, term168166.getClass(), "characterVoiceNo", -1266016022);
        setIntField(term168166, term168166.getClass(), "tabSetting", -1417549926);
        setIntField(term168166, term168166.getClass(), "tabSortSetting", -1109645729);
        setIntField(term168166, term168166.getClass(), "cardCategorySetting", -137499193);
        setIntField(term168166, term168166.getClass(), "cardSortSetting", 1206373587);
        setIntField(term168166, term168166.getClass(), "rivalScoreCategorySetting", 613409117);
        setIntField(term168166, term168166.getClass(), "playedTutorialBit", 449106222);
        setIntField(term168166, term168166.getClass(), "firstTutorialCancelNum", -2010754765);
        setLongField(term168166, term168166.getClass(), "sumTechHighScore", 3258015411464637764L);
        setLongField(term168166, term168166.getClass(), "sumTechBasicHighScore", 869392470837426566L);
        setLongField(term168166, term168166.getClass(), "sumTechAdvancedHighScore", 4646930212097294716L);
        setLongField(term168166, term168166.getClass(), "sumTechExpertHighScore", 3463084499266875904L);
        setLongField(term168166, term168166.getClass(), "sumTechMasterHighScore", -7732584336161913999L);
        setLongField(term168166, term168166.getClass(), "sumTechLunaticHighScore", -9198569837410546989L);
        setLongField(term168166, term168166.getClass(), "sumBattleHighScore", -1774178372431419404L);
        setLongField(term168166, term168166.getClass(), "sumBattleBasicHighScore", -5232167923670406765L);
        setLongField(term168166, term168166.getClass(), "sumBattleAdvancedHighScore", 2839192734257680041L);
        setLongField(term168166, term168166.getClass(), "sumBattleExpertHighScore", -6632951164960930766L);
        setLongField(term168166, term168166.getClass(), "sumBattleMasterHighScore", -5628065665330605775L);
        setLongField(term168166, term168166.getClass(), "sumBattleLunaticHighScore", -3198795776779837753L);
        setField(term168166, term168166.getClass(), "eventWatchedDate", "mgkQBUvphv");
        setField(term168166, term168166.getClass(), "cmEventWatchedDate", "dJlSrWNDYm");
        setField(term168166, term168166.getClass(), "firstGameId", "zujngrxTdi");
        setField(term168166, term168166.getClass(), "firstRomVersion", "dUMVLBTbEk");
        setField(term168166, term168166.getClass(), "firstDataVersion", "pCIkJvQHAe");
        setField(term168166, term168166.getClass(), "firstPlayDate", "mdBsUlfxyo");
        setField(term168166, term168166.getClass(), "lastGameId", "rjdrxuqbGW");
        setField(term168166, term168166.getClass(), "lastRomVersion", "GpIbcNKMcu");
        setField(term168166, term168166.getClass(), "lastDataVersion", "qqXzVxBqnp");
        setField(term168166, term168166.getClass(), "compatibleCmVersion", "vmQnHcLuhe");
        setField(term168166, term168166.getClass(), "lastPlayDate", "dqUfuUFYxb");
        setIntField(term168166, term168166.getClass(), "lastPlaceId", -368905928);
        setField(term168166, term168166.getClass(), "lastPlaceName", "ANdAmkYIYK");
        setIntField(term168166, term168166.getClass(), "lastRegionId", -324230177);
        setField(term168166, term168166.getClass(), "lastRegionName", "TwCTlmvhLX");
        setIntField(term168166, term168166.getClass(), "lastAllNetId", 1907785292);
        setField(term168166, term168166.getClass(), "lastClientId", "wOpBgzSakN");
        setIntField(term168166, term168166.getClass(), "lastUsedDeckId", 719178137);
        setIntField(term168166, term168166.getClass(), "lastPlayMusicLevel", 1019714790);
        setIntField(term168166, term168166.getClass(), "lastEmoneyBrand", -939662649);
        setField(term168164, term168164.getClass(), "user", term168166);
        setIntField(term168164, term168164.getClass(), "characterId", 104511876);
        setIntField(term168164, term168164.getClass(), "costumeId", 1301097770);
        setIntField(term168164, term168164.getClass(), "attachmentId", -844791112);
        setIntField(term168164, term168164.getClass(), "playCount", -1096097856);
        setIntField(term168164, term168164.getClass(), "intimateLevel", 402256223);
        setIntField(term168164, term168164.getClass(), "intimateCount", 1448377823);
        setIntField(term168164, term168164.getClass(), "intimateCountRewarded", -1324686514);
        setField(term168164, term168164.getClass(), "intimateCountDate", "tEgVTQbEmh");
        setBooleanField(term168164, term168164.getClass(), "isNew", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term168164, args);
    }

};


