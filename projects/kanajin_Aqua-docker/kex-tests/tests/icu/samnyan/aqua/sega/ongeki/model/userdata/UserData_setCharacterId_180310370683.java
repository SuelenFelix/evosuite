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

public class UserData_setCharacterId_180310370683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57133;
     Object term57396;

    public UserData_setCharacterId_180310370683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57137 = new Long(6843866297465638866L);
        term57133 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term57135 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term57151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57156 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57161 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57166 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term57133, term57133.getClass(), "id", 6525495646197522413L);
        setLongField(term57135, term57135.getClass(), "id", -8011235289697333196L);
        setField(term57135, term57135.getClass(), "extId", term57137);
        setField(term57135, term57135.getClass(), "luid", "VclIptmKrF");
        setIntField(term57152, term57152.getClass(), "year", 2010);
        setShortField(term57152, term57152.getClass(), "month", (short) 9);
        setShortField(term57152, term57152.getClass(), "day", (short) 26);
        setField(term57151, term57151.getClass(), "date", term57152);
        setByteField(term57156, term57156.getClass(), "hour", (byte) 17);
        setByteField(term57156, term57156.getClass(), "minute", (byte) 5);
        setByteField(term57156, term57156.getClass(), "second", (byte) 52);
        setIntField(term57156, term57156.getClass(), "nano", 138292575);
        setField(term57151, term57151.getClass(), "time", term57156);
        setField(term57135, term57135.getClass(), "registerTime", term57151);
        setIntField(term57162, term57162.getClass(), "year", 2022);
        setShortField(term57162, term57162.getClass(), "month", (short) 10);
        setShortField(term57162, term57162.getClass(), "day", (short) 14);
        setField(term57161, term57161.getClass(), "date", term57162);
        setByteField(term57166, term57166.getClass(), "hour", (byte) 10);
        setByteField(term57166, term57166.getClass(), "minute", (byte) 28);
        setByteField(term57166, term57166.getClass(), "second", (byte) 24);
        setIntField(term57166, term57166.getClass(), "nano", 117469048);
        setField(term57161, term57161.getClass(), "time", term57166);
        setField(term57135, term57135.getClass(), "accessTime", term57161);
        setField(term57133, term57133.getClass(), "card", term57135);
        setField(term57133, term57133.getClass(), "userName", "wcTeSHCZwz");
        setIntField(term57133, term57133.getClass(), "level", 1665464572);
        setIntField(term57133, term57133.getClass(), "reincarnationNum", -685125586);
        setLongField(term57133, term57133.getClass(), "exp", -7330824948049319002L);
        setLongField(term57133, term57133.getClass(), "point", 4297489130688944583L);
        setLongField(term57133, term57133.getClass(), "totalPoint", 8960957647363939651L);
        setIntField(term57133, term57133.getClass(), "playCount", 708362673);
        setIntField(term57133, term57133.getClass(), "jewelCount", -630444357);
        setIntField(term57133, term57133.getClass(), "totalJewelCount", 936421624);
        setIntField(term57133, term57133.getClass(), "medalCount", -616512894);
        setIntField(term57133, term57133.getClass(), "playerRating", 710841913);
        setIntField(term57133, term57133.getClass(), "highestRating", 293875732);
        setIntField(term57133, term57133.getClass(), "battlePoint", -375636222);
        setIntField(term57133, term57133.getClass(), "bestBattlePoint", 2019131833);
        setIntField(term57133, term57133.getClass(), "overDamageBattlePoint", -2057057319);
        setBooleanField(term57133, term57133.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term57133, term57133.getClass(), "nameplateId", -872007840);
        setIntField(term57133, term57133.getClass(), "trophyId", 614977875);
        setIntField(term57133, term57133.getClass(), "cardId", -424672642);
        setIntField(term57133, term57133.getClass(), "characterId", -1836107736);
        setIntField(term57133, term57133.getClass(), "characterVoiceNo", 1774306588);
        setIntField(term57133, term57133.getClass(), "tabSetting", 897867869);
        setIntField(term57133, term57133.getClass(), "tabSortSetting", -1058380964);
        setIntField(term57133, term57133.getClass(), "cardCategorySetting", 1144389305);
        setIntField(term57133, term57133.getClass(), "cardSortSetting", 785140032);
        setIntField(term57133, term57133.getClass(), "rivalScoreCategorySetting", 2011478303);
        setIntField(term57133, term57133.getClass(), "playedTutorialBit", -1064254847);
        setIntField(term57133, term57133.getClass(), "firstTutorialCancelNum", 427797900);
        setLongField(term57133, term57133.getClass(), "sumTechHighScore", -7528632195747779L);
        setLongField(term57133, term57133.getClass(), "sumTechBasicHighScore", -4184249863979858011L);
        setLongField(term57133, term57133.getClass(), "sumTechAdvancedHighScore", -3524527156552491025L);
        setLongField(term57133, term57133.getClass(), "sumTechExpertHighScore", -6850320595253329951L);
        setLongField(term57133, term57133.getClass(), "sumTechMasterHighScore", 5358056200486376020L);
        setLongField(term57133, term57133.getClass(), "sumTechLunaticHighScore", -4914143694950160865L);
        setLongField(term57133, term57133.getClass(), "sumBattleHighScore", -1749621039048991870L);
        setLongField(term57133, term57133.getClass(), "sumBattleBasicHighScore", 4849764353789057222L);
        setLongField(term57133, term57133.getClass(), "sumBattleAdvancedHighScore", -5669163500655780876L);
        setLongField(term57133, term57133.getClass(), "sumBattleExpertHighScore", -9197280619599317547L);
        setLongField(term57133, term57133.getClass(), "sumBattleMasterHighScore", 2958081309532830349L);
        setLongField(term57133, term57133.getClass(), "sumBattleLunaticHighScore", -1656614758988755309L);
        setField(term57133, term57133.getClass(), "eventWatchedDate", "fxxnbYOiZZ");
        setField(term57133, term57133.getClass(), "cmEventWatchedDate", "CTnRYaYXia");
        setField(term57133, term57133.getClass(), "firstGameId", "SUIYUFtCCe");
        setField(term57133, term57133.getClass(), "firstRomVersion", "eKCrPCkedw");
        setField(term57133, term57133.getClass(), "firstDataVersion", "VAFSknHLsZ");
        setField(term57133, term57133.getClass(), "firstPlayDate", "MamzBtwhiz");
        setField(term57133, term57133.getClass(), "lastGameId", "wVOypfVLsP");
        setField(term57133, term57133.getClass(), "lastRomVersion", "pEazBcUUWX");
        setField(term57133, term57133.getClass(), "lastDataVersion", "nlvRWrTxvz");
        setField(term57133, term57133.getClass(), "compatibleCmVersion", "isMKwgUmka");
        setField(term57133, term57133.getClass(), "lastPlayDate", "pDIyzhDtTy");
        setIntField(term57133, term57133.getClass(), "lastPlaceId", 948009124);
        setField(term57133, term57133.getClass(), "lastPlaceName", "wXiUlhXQoC");
        setIntField(term57133, term57133.getClass(), "lastRegionId", 1688840379);
        setField(term57133, term57133.getClass(), "lastRegionName", "gKhmgJzimH");
        setIntField(term57133, term57133.getClass(), "lastAllNetId", -1811534908);
        setField(term57133, term57133.getClass(), "lastClientId", "OzRiWLVXNx");
        setIntField(term57133, term57133.getClass(), "lastUsedDeckId", -1024774970);
        setIntField(term57133, term57133.getClass(), "lastPlayMusicLevel", 191435935);
        setIntField(term57133, term57133.getClass(), "lastEmoneyBrand", -1320856251);
        term57396 = new Integer(957604584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57396;
        callMethod(klass, "setCharacterId", argTypes, term57133, args);
    }

};


