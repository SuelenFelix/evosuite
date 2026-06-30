package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_getTabSetting_184301818222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3172936;

    public ExternalUserData_getTabSetting_184301818222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3172936 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3172936, term3172936.getClass(), "accessCode", "XkuQBWdBfn");
        setField(term3172936, term3172936.getClass(), "userName", "VRfHwbAkRW");
        setIntField(term3172936, term3172936.getClass(), "level", 2092890645);
        setIntField(term3172936, term3172936.getClass(), "reincarnationNum", 1703316825);
        setLongField(term3172936, term3172936.getClass(), "exp", 1426101888979462190L);
        setLongField(term3172936, term3172936.getClass(), "point", -1072695584260328535L);
        setLongField(term3172936, term3172936.getClass(), "totalPoint", -7974261217917302525L);
        setIntField(term3172936, term3172936.getClass(), "playCount", -948100540);
        setIntField(term3172936, term3172936.getClass(), "jewelCount", 400932472);
        setIntField(term3172936, term3172936.getClass(), "totalJewelCount", 1198520358);
        setIntField(term3172936, term3172936.getClass(), "medalCount", 1875272938);
        setIntField(term3172936, term3172936.getClass(), "playerRating", -1575243067);
        setIntField(term3172936, term3172936.getClass(), "highestRating", -159113883);
        setIntField(term3172936, term3172936.getClass(), "battlePoint", -1111443657);
        setIntField(term3172936, term3172936.getClass(), "bestBattlePoint", -325851921);
        setIntField(term3172936, term3172936.getClass(), "overDamageBattlePoint", 1019236038);
        setIntField(term3172936, term3172936.getClass(), "nameplateId", 462294593);
        setIntField(term3172936, term3172936.getClass(), "trophyId", 390384176);
        setIntField(term3172936, term3172936.getClass(), "cardId", 1466258466);
        setIntField(term3172936, term3172936.getClass(), "characterId", 1630843258);
        setIntField(term3172936, term3172936.getClass(), "tabSetting", -1524541401);
        setIntField(term3172936, term3172936.getClass(), "tabSortSetting", 818639343);
        setIntField(term3172936, term3172936.getClass(), "cardCategorySetting", -895753655);
        setIntField(term3172936, term3172936.getClass(), "cardSortSetting", 643872824);
        setIntField(term3172936, term3172936.getClass(), "rivalScoreCategorySetting", -1027089120);
        setIntField(term3172936, term3172936.getClass(), "playedTutorialBit", 7166644);
        setIntField(term3172936, term3172936.getClass(), "firstTutorialCancelNum", 297083853);
        setLongField(term3172936, term3172936.getClass(), "sumTechHighScore", -987138505221895940L);
        setLongField(term3172936, term3172936.getClass(), "sumTechBasicHighScore", -2649809932288093128L);
        setLongField(term3172936, term3172936.getClass(), "sumTechAdvancedHighScore", -6063503598289983811L);
        setLongField(term3172936, term3172936.getClass(), "sumTechExpertHighScore", -5592550436193321908L);
        setLongField(term3172936, term3172936.getClass(), "sumTechMasterHighScore", -6290319653734243570L);
        setLongField(term3172936, term3172936.getClass(), "sumTechLunaticHighScore", 438485067535082533L);
        setLongField(term3172936, term3172936.getClass(), "sumBattleHighScore", 1266357589765805604L);
        setLongField(term3172936, term3172936.getClass(), "sumBattleBasicHighScore", 6927778021502489466L);
        setLongField(term3172936, term3172936.getClass(), "sumBattleAdvancedHighScore", -8491064934549438642L);
        setLongField(term3172936, term3172936.getClass(), "sumBattleExpertHighScore", 3670518904581999984L);
        setLongField(term3172936, term3172936.getClass(), "sumBattleMasterHighScore", -4529648647466338762L);
        setLongField(term3172936, term3172936.getClass(), "sumBattleLunaticHighScore", 4359335683532434823L);
        setField(term3172936, term3172936.getClass(), "eventWatchedDate", "uxFXxQZrhw");
        setField(term3172936, term3172936.getClass(), "cmEventWatchedDate", "izmDtyjNVZ");
        setField(term3172936, term3172936.getClass(), "firstGameId", "RAWTYBkzNN");
        setField(term3172936, term3172936.getClass(), "firstRomVersion", "ViTBEuIIjA");
        setField(term3172936, term3172936.getClass(), "firstDataVersion", "DmEvsqwKvW");
        setField(term3172936, term3172936.getClass(), "firstPlayDate", "EwDXiMkVUH");
        setField(term3172936, term3172936.getClass(), "lastGameId", "YIsinYlJtP");
        setField(term3172936, term3172936.getClass(), "lastRomVersion", "ZCdBYEJfUY");
        setField(term3172936, term3172936.getClass(), "lastDataVersion", "NkoZhQMYKL");
        setField(term3172936, term3172936.getClass(), "compatibleCmVersion", "GDgifbXmLV");
        setField(term3172936, term3172936.getClass(), "lastPlayDate", "YbrBgvDXko");
        setIntField(term3172936, term3172936.getClass(), "lastPlaceId", 1758656639);
        setField(term3172936, term3172936.getClass(), "lastPlaceName", "iMEjatKTnX");
        setIntField(term3172936, term3172936.getClass(), "lastRegionId", -2112417319);
        setField(term3172936, term3172936.getClass(), "lastRegionName", "uvMytLwTGk");
        setIntField(term3172936, term3172936.getClass(), "lastAllNetId", 1827556287);
        setField(term3172936, term3172936.getClass(), "lastClientId", "gOVaWynyZj");
        setIntField(term3172936, term3172936.getClass(), "lastUsedDeckId", 1155543693);
        setIntField(term3172936, term3172936.getClass(), "lastPlayMusicLevel", 539898425);
        setIntField(term3172936, term3172936.getClass(), "lastEmoneyBrand", -777864042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTabSetting", argTypes, term3172936, args);
    }

};


