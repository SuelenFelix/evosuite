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

public class UserCharacter_init_18188558200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167741;

    public UserCharacter_init_18188558200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term167745 = new Long(3472971833455746664L);
        term167741 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term167743 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term167759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167764 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167769 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167770 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167774 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term167741, term167741.getClass(), "id", 2080051965907831369L);
        setLongField(term167743, term167743.getClass(), "id", -4195585882125852631L);
        setField(term167743, term167743.getClass(), "extId", term167745);
        setField(term167743, term167743.getClass(), "luid", "RSaouOqUAj");
        setIntField(term167760, term167760.getClass(), "year", 2026);
        setShortField(term167760, term167760.getClass(), "month", (short) 11);
        setShortField(term167760, term167760.getClass(), "day", (short) 25);
        setField(term167759, term167759.getClass(), "date", term167760);
        setByteField(term167764, term167764.getClass(), "hour", (byte) 12);
        setByteField(term167764, term167764.getClass(), "minute", (byte) 39);
        setByteField(term167764, term167764.getClass(), "second", (byte) 8);
        setIntField(term167764, term167764.getClass(), "nano", 444272669);
        setField(term167759, term167759.getClass(), "time", term167764);
        setField(term167743, term167743.getClass(), "registerTime", term167759);
        setIntField(term167770, term167770.getClass(), "year", 2023);
        setShortField(term167770, term167770.getClass(), "month", (short) 1);
        setShortField(term167770, term167770.getClass(), "day", (short) 9);
        setField(term167769, term167769.getClass(), "date", term167770);
        setByteField(term167774, term167774.getClass(), "hour", (byte) 5);
        setByteField(term167774, term167774.getClass(), "minute", (byte) 45);
        setByteField(term167774, term167774.getClass(), "second", (byte) 39);
        setIntField(term167774, term167774.getClass(), "nano", 734895244);
        setField(term167769, term167769.getClass(), "time", term167774);
        setField(term167743, term167743.getClass(), "accessTime", term167769);
        setField(term167741, term167741.getClass(), "card", term167743);
        setField(term167741, term167741.getClass(), "userName", "HJeUoPJXeH");
        setIntField(term167741, term167741.getClass(), "level", -2110112489);
        setIntField(term167741, term167741.getClass(), "reincarnationNum", 911599446);
        setLongField(term167741, term167741.getClass(), "exp", -7771426303082571181L);
        setLongField(term167741, term167741.getClass(), "point", -461329147930703249L);
        setLongField(term167741, term167741.getClass(), "totalPoint", -8366220047794225218L);
        setIntField(term167741, term167741.getClass(), "playCount", -307818529);
        setIntField(term167741, term167741.getClass(), "jewelCount", 700090526);
        setIntField(term167741, term167741.getClass(), "totalJewelCount", 8095828);
        setIntField(term167741, term167741.getClass(), "medalCount", 491999819);
        setIntField(term167741, term167741.getClass(), "playerRating", 594900088);
        setIntField(term167741, term167741.getClass(), "highestRating", 1012824901);
        setIntField(term167741, term167741.getClass(), "battlePoint", 953916253);
        setIntField(term167741, term167741.getClass(), "bestBattlePoint", -972613566);
        setIntField(term167741, term167741.getClass(), "overDamageBattlePoint", 423167476);
        setBooleanField(term167741, term167741.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term167741, term167741.getClass(), "nameplateId", -918637899);
        setIntField(term167741, term167741.getClass(), "trophyId", -47058112);
        setIntField(term167741, term167741.getClass(), "cardId", 2073925569);
        setIntField(term167741, term167741.getClass(), "characterId", 1903299320);
        setIntField(term167741, term167741.getClass(), "characterVoiceNo", 496281999);
        setIntField(term167741, term167741.getClass(), "tabSetting", -129667876);
        setIntField(term167741, term167741.getClass(), "tabSortSetting", -1081751617);
        setIntField(term167741, term167741.getClass(), "cardCategorySetting", -1698342837);
        setIntField(term167741, term167741.getClass(), "cardSortSetting", -508110901);
        setIntField(term167741, term167741.getClass(), "rivalScoreCategorySetting", 2086708952);
        setIntField(term167741, term167741.getClass(), "playedTutorialBit", 1938826379);
        setIntField(term167741, term167741.getClass(), "firstTutorialCancelNum", -1574173199);
        setLongField(term167741, term167741.getClass(), "sumTechHighScore", 5938335049432738507L);
        setLongField(term167741, term167741.getClass(), "sumTechBasicHighScore", 8101424453166597716L);
        setLongField(term167741, term167741.getClass(), "sumTechAdvancedHighScore", -3794905176195309921L);
        setLongField(term167741, term167741.getClass(), "sumTechExpertHighScore", -3977066406545237877L);
        setLongField(term167741, term167741.getClass(), "sumTechMasterHighScore", 4050545655807589401L);
        setLongField(term167741, term167741.getClass(), "sumTechLunaticHighScore", 1419799849423868495L);
        setLongField(term167741, term167741.getClass(), "sumBattleHighScore", 2530677345139764372L);
        setLongField(term167741, term167741.getClass(), "sumBattleBasicHighScore", 6854410637631093763L);
        setLongField(term167741, term167741.getClass(), "sumBattleAdvancedHighScore", -2684937579371181761L);
        setLongField(term167741, term167741.getClass(), "sumBattleExpertHighScore", -5478802546630413879L);
        setLongField(term167741, term167741.getClass(), "sumBattleMasterHighScore", -567503879183114756L);
        setLongField(term167741, term167741.getClass(), "sumBattleLunaticHighScore", 3600842501953108737L);
        setField(term167741, term167741.getClass(), "eventWatchedDate", "zHnjCnTBlM");
        setField(term167741, term167741.getClass(), "cmEventWatchedDate", "yZArpKdGoJ");
        setField(term167741, term167741.getClass(), "firstGameId", "wwMlzhTtbM");
        setField(term167741, term167741.getClass(), "firstRomVersion", "xcAalPvMas");
        setField(term167741, term167741.getClass(), "firstDataVersion", "CUcmZFIqJn");
        setField(term167741, term167741.getClass(), "firstPlayDate", "jZSTuVeJwm");
        setField(term167741, term167741.getClass(), "lastGameId", "sZtJeHgDoS");
        setField(term167741, term167741.getClass(), "lastRomVersion", "PNjoWpTIKl");
        setField(term167741, term167741.getClass(), "lastDataVersion", "czpPLQIQFj");
        setField(term167741, term167741.getClass(), "compatibleCmVersion", "FLMgyDzlCF");
        setField(term167741, term167741.getClass(), "lastPlayDate", "ZwHgGCiCeV");
        setIntField(term167741, term167741.getClass(), "lastPlaceId", -1165441979);
        setField(term167741, term167741.getClass(), "lastPlaceName", "QbPwthOQnr");
        setIntField(term167741, term167741.getClass(), "lastRegionId", -1921642793);
        setField(term167741, term167741.getClass(), "lastRegionName", "JIQQIDNpGz");
        setIntField(term167741, term167741.getClass(), "lastAllNetId", -753596691);
        setField(term167741, term167741.getClass(), "lastClientId", "lAvGKEIUzY");
        setIntField(term167741, term167741.getClass(), "lastUsedDeckId", 1203822968);
        setIntField(term167741, term167741.getClass(), "lastPlayMusicLevel", -149149061);
        setIntField(term167741, term167741.getClass(), "lastEmoneyBrand", 1599802857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term167741;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


