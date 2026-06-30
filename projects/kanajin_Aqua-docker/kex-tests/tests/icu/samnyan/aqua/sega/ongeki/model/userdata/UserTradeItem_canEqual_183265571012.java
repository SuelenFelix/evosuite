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

public class UserTradeItem_canEqual_183265571012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155832;
     Object term156100;

    public UserTradeItem_canEqual_183265571012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term155838 = new Long(4742108233936970770L);
        term155832 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term155834 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term155836 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term155852 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155853 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155857 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155862 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155863 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155867 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term155832, term155832.getClass(), "id", 7873468309001160488L);
        setLongField(term155834, term155834.getClass(), "id", -4872484045633343100L);
        setLongField(term155836, term155836.getClass(), "id", 5054033979699834646L);
        setField(term155836, term155836.getClass(), "extId", term155838);
        setField(term155836, term155836.getClass(), "luid", "gyeAErvtXb");
        setIntField(term155853, term155853.getClass(), "year", 2020);
        setShortField(term155853, term155853.getClass(), "month", (short) 8);
        setShortField(term155853, term155853.getClass(), "day", (short) 5);
        setField(term155852, term155852.getClass(), "date", term155853);
        setByteField(term155857, term155857.getClass(), "hour", (byte) 12);
        setByteField(term155857, term155857.getClass(), "minute", (byte) 1);
        setByteField(term155857, term155857.getClass(), "second", (byte) 26);
        setIntField(term155857, term155857.getClass(), "nano", 71456472);
        setField(term155852, term155852.getClass(), "time", term155857);
        setField(term155836, term155836.getClass(), "registerTime", term155852);
        setIntField(term155863, term155863.getClass(), "year", 2011);
        setShortField(term155863, term155863.getClass(), "month", (short) 11);
        setShortField(term155863, term155863.getClass(), "day", (short) 10);
        setField(term155862, term155862.getClass(), "date", term155863);
        setByteField(term155867, term155867.getClass(), "hour", (byte) 6);
        setByteField(term155867, term155867.getClass(), "minute", (byte) 13);
        setByteField(term155867, term155867.getClass(), "second", (byte) 21);
        setIntField(term155867, term155867.getClass(), "nano", 381837054);
        setField(term155862, term155862.getClass(), "time", term155867);
        setField(term155836, term155836.getClass(), "accessTime", term155862);
        setField(term155834, term155834.getClass(), "card", term155836);
        setField(term155834, term155834.getClass(), "userName", "IEsZEVbFZG");
        setIntField(term155834, term155834.getClass(), "level", 243703890);
        setIntField(term155834, term155834.getClass(), "reincarnationNum", -2015558089);
        setLongField(term155834, term155834.getClass(), "exp", 658500236944944374L);
        setLongField(term155834, term155834.getClass(), "point", -2706892193113781197L);
        setLongField(term155834, term155834.getClass(), "totalPoint", -1192466301838383709L);
        setIntField(term155834, term155834.getClass(), "playCount", -1965545269);
        setIntField(term155834, term155834.getClass(), "jewelCount", -1898898123);
        setIntField(term155834, term155834.getClass(), "totalJewelCount", 499139452);
        setIntField(term155834, term155834.getClass(), "medalCount", -471563064);
        setIntField(term155834, term155834.getClass(), "playerRating", -1803846804);
        setIntField(term155834, term155834.getClass(), "highestRating", 1011728980);
        setIntField(term155834, term155834.getClass(), "battlePoint", -1674151373);
        setIntField(term155834, term155834.getClass(), "bestBattlePoint", 2007242087);
        setIntField(term155834, term155834.getClass(), "overDamageBattlePoint", 33663834);
        setBooleanField(term155834, term155834.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term155834, term155834.getClass(), "nameplateId", 1194874786);
        setIntField(term155834, term155834.getClass(), "trophyId", -1495464639);
        setIntField(term155834, term155834.getClass(), "cardId", -1504462202);
        setIntField(term155834, term155834.getClass(), "characterId", 125976040);
        setIntField(term155834, term155834.getClass(), "characterVoiceNo", -666251907);
        setIntField(term155834, term155834.getClass(), "tabSetting", 417356870);
        setIntField(term155834, term155834.getClass(), "tabSortSetting", -488295525);
        setIntField(term155834, term155834.getClass(), "cardCategorySetting", 2035542822);
        setIntField(term155834, term155834.getClass(), "cardSortSetting", 1606668266);
        setIntField(term155834, term155834.getClass(), "rivalScoreCategorySetting", 1659642005);
        setIntField(term155834, term155834.getClass(), "playedTutorialBit", 1181466680);
        setIntField(term155834, term155834.getClass(), "firstTutorialCancelNum", 1039050085);
        setLongField(term155834, term155834.getClass(), "sumTechHighScore", 1368557283066981343L);
        setLongField(term155834, term155834.getClass(), "sumTechBasicHighScore", 6590977446424762721L);
        setLongField(term155834, term155834.getClass(), "sumTechAdvancedHighScore", -3753828594925236519L);
        setLongField(term155834, term155834.getClass(), "sumTechExpertHighScore", -2980872849014503888L);
        setLongField(term155834, term155834.getClass(), "sumTechMasterHighScore", 8143078360158902496L);
        setLongField(term155834, term155834.getClass(), "sumTechLunaticHighScore", 1622805710482087035L);
        setLongField(term155834, term155834.getClass(), "sumBattleHighScore", 6925038568830195357L);
        setLongField(term155834, term155834.getClass(), "sumBattleBasicHighScore", -5888026883804622434L);
        setLongField(term155834, term155834.getClass(), "sumBattleAdvancedHighScore", -1508478131158925889L);
        setLongField(term155834, term155834.getClass(), "sumBattleExpertHighScore", 5763410539655354024L);
        setLongField(term155834, term155834.getClass(), "sumBattleMasterHighScore", 3788556609185745767L);
        setLongField(term155834, term155834.getClass(), "sumBattleLunaticHighScore", -1954015532365465759L);
        setField(term155834, term155834.getClass(), "eventWatchedDate", "hefxCEhnuL");
        setField(term155834, term155834.getClass(), "cmEventWatchedDate", "nAZCgcAqKF");
        setField(term155834, term155834.getClass(), "firstGameId", "qEwUfGEixD");
        setField(term155834, term155834.getClass(), "firstRomVersion", "gzwdEqELlU");
        setField(term155834, term155834.getClass(), "firstDataVersion", "PVcLgfdPEf");
        setField(term155834, term155834.getClass(), "firstPlayDate", "PEDTNvvicf");
        setField(term155834, term155834.getClass(), "lastGameId", "CoEwWlFbOr");
        setField(term155834, term155834.getClass(), "lastRomVersion", "oKzUOrAFFo");
        setField(term155834, term155834.getClass(), "lastDataVersion", "cShhTkvRUF");
        setField(term155834, term155834.getClass(), "compatibleCmVersion", "qgiseKtoqu");
        setField(term155834, term155834.getClass(), "lastPlayDate", "FfGmyAKSaB");
        setIntField(term155834, term155834.getClass(), "lastPlaceId", -1960930871);
        setField(term155834, term155834.getClass(), "lastPlaceName", "icoPCGhgWH");
        setIntField(term155834, term155834.getClass(), "lastRegionId", -1230284197);
        setField(term155834, term155834.getClass(), "lastRegionName", "CHQBuYSRSj");
        setIntField(term155834, term155834.getClass(), "lastAllNetId", -506167207);
        setField(term155834, term155834.getClass(), "lastClientId", "UyXrmrYEff");
        setIntField(term155834, term155834.getClass(), "lastUsedDeckId", 1701319929);
        setIntField(term155834, term155834.getClass(), "lastPlayMusicLevel", 753637194);
        setIntField(term155834, term155834.getClass(), "lastEmoneyBrand", -1087577082);
        setField(term155832, term155832.getClass(), "user", term155834);
        setIntField(term155832, term155832.getClass(), "chapterId", 827590140);
        setIntField(term155832, term155832.getClass(), "tradeItemId", 1280674880);
        setIntField(term155832, term155832.getClass(), "tradeCount", -2081016929);
        term156100 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term156100;
        callMethod(klass, "canEqual", argTypes, term155832, args);
    }

};


