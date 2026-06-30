package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_setLastPlaceName_1962611716344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288112;

    public UserData_setLastPlaceName_1962611716344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288112 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term288112, term288112.getClass(), "id", 0L);
        setField(term288112, term288112.getClass(), "card", null);
        setField(term288112, term288112.getClass(), "userName", null);
        setIntField(term288112, term288112.getClass(), "level", 0);
        setIntField(term288112, term288112.getClass(), "reincarnationNum", 0);
        setField(term288112, term288112.getClass(), "exp", null);
        setLongField(term288112, term288112.getClass(), "point", 0L);
        setLongField(term288112, term288112.getClass(), "totalPoint", 0L);
        setIntField(term288112, term288112.getClass(), "playCount", 0);
        setIntField(term288112, term288112.getClass(), "multiPlayCount", 0);
        setIntField(term288112, term288112.getClass(), "playerRating", 0);
        setIntField(term288112, term288112.getClass(), "highestRating", 0);
        setIntField(term288112, term288112.getClass(), "nameplateId", 0);
        setIntField(term288112, term288112.getClass(), "frameId", 0);
        setIntField(term288112, term288112.getClass(), "characterId", 0);
        setIntField(term288112, term288112.getClass(), "trophyId", 0);
        setIntField(term288112, term288112.getClass(), "playedTutorialBit", 0);
        setIntField(term288112, term288112.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term288112, term288112.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term288112, term288112.getClass(), "totalMapNum", 0);
        setLongField(term288112, term288112.getClass(), "totalHiScore", 0L);
        setLongField(term288112, term288112.getClass(), "totalBasicHighScore", 0L);
        setLongField(term288112, term288112.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term288112, term288112.getClass(), "totalExpertHighScore", 0L);
        setLongField(term288112, term288112.getClass(), "totalMasterHighScore", 0L);
        setLongField(term288112, term288112.getClass(), "totalUltimaHighScore", 0L);
        setField(term288112, term288112.getClass(), "eventWatchedDate", null);
        setIntField(term288112, term288112.getClass(), "friendCount", 0);
        setField(term288112, term288112.getClass(), "firstGameId", null);
        setField(term288112, term288112.getClass(), "firstRomVersion", null);
        setField(term288112, term288112.getClass(), "firstDataVersion", null);
        setField(term288112, term288112.getClass(), "firstPlayDate", null);
        setField(term288112, term288112.getClass(), "lastGameId", null);
        setField(term288112, term288112.getClass(), "lastRomVersion", null);
        setField(term288112, term288112.getClass(), "lastDataVersion", null);
        setField(term288112, term288112.getClass(), "lastLoginDate", null);
        setField(term288112, term288112.getClass(), "lastPlayDate", null);
        setIntField(term288112, term288112.getClass(), "lastPlaceId", 0);
        setField(term288112, term288112.getClass(), "lastPlaceName", null);
        setField(term288112, term288112.getClass(), "lastRegionId", null);
        setField(term288112, term288112.getClass(), "lastRegionName", null);
        setField(term288112, term288112.getClass(), "lastAllNetId", null);
        setField(term288112, term288112.getClass(), "lastClientId", null);
        setField(term288112, term288112.getClass(), "lastCountryCode", null);
        setField(term288112, term288112.getClass(), "userNameEx", null);
        setField(term288112, term288112.getClass(), "compatibleCmVersion", null);
        setIntField(term288112, term288112.getClass(), "medal", 0);
        setIntField(term288112, term288112.getClass(), "mapIconId", 0);
        setIntField(term288112, term288112.getClass(), "voiceId", 0);
        setIntField(term288112, term288112.getClass(), "avatarWear", 0);
        setIntField(term288112, term288112.getClass(), "avatarHead", 0);
        setIntField(term288112, term288112.getClass(), "avatarFace", 0);
        setIntField(term288112, term288112.getClass(), "avatarSkin", 0);
        setIntField(term288112, term288112.getClass(), "avatarItem", 0);
        setIntField(term288112, term288112.getClass(), "avatarFront", 0);
        setIntField(term288112, term288112.getClass(), "avatarBack", 0);
        setIntField(term288112, term288112.getClass(), "classEmblemBase", 0);
        setIntField(term288112, term288112.getClass(), "classEmblemMedal", 0);
        setIntField(term288112, term288112.getClass(), "stockedGridCount", 0);
        setIntField(term288112, term288112.getClass(), "exMapLoopCount", 0);
        setIntField(term288112, term288112.getClass(), "netBattlePlayCount", 0);
        setIntField(term288112, term288112.getClass(), "netBattleWinCount", 0);
        setIntField(term288112, term288112.getClass(), "netBattleLoseCount", 0);
        setIntField(term288112, term288112.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term288112, term288112.getClass(), "charaIllustId", 0);
        setIntField(term288112, term288112.getClass(), "skillId", 0);
        setIntField(term288112, term288112.getClass(), "overPowerPoint", 0);
        setIntField(term288112, term288112.getClass(), "overPowerRate", 0);
        setIntField(term288112, term288112.getClass(), "overPowerLowerRank", 0);
        setIntField(term288112, term288112.getClass(), "avatarPoint", 0);
        setIntField(term288112, term288112.getClass(), "battleRankId", 0);
        setIntField(term288112, term288112.getClass(), "battleRankPoint", 0);
        setIntField(term288112, term288112.getClass(), "eliteRankPoint", 0);
        setIntField(term288112, term288112.getClass(), "netBattle1stCount", 0);
        setIntField(term288112, term288112.getClass(), "netBattle2ndCount", 0);
        setIntField(term288112, term288112.getClass(), "netBattle3rdCount", 0);
        setIntField(term288112, term288112.getClass(), "netBattle4thCount", 0);
        setIntField(term288112, term288112.getClass(), "netBattleCorrection", 0);
        setIntField(term288112, term288112.getClass(), "netBattleErrCnt", 0);
        setIntField(term288112, term288112.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term288112, term288112.getClass(), "battleRewardStatus", 0);
        setIntField(term288112, term288112.getClass(), "battleRewardIndex", 0);
        setIntField(term288112, term288112.getClass(), "battleRewardCount", 0);
        setIntField(term288112, term288112.getClass(), "ext1", 0);
        setIntField(term288112, term288112.getClass(), "ext2", 0);
        setIntField(term288112, term288112.getClass(), "ext3", 0);
        setIntField(term288112, term288112.getClass(), "ext4", 0);
        setIntField(term288112, term288112.getClass(), "ext5", 0);
        setIntField(term288112, term288112.getClass(), "ext6", 0);
        setIntField(term288112, term288112.getClass(), "ext7", 0);
        setIntField(term288112, term288112.getClass(), "ext8", 0);
        setIntField(term288112, term288112.getClass(), "ext9", 0);
        setIntField(term288112, term288112.getClass(), "ext10", 0);
        setField(term288112, term288112.getClass(), "extStr1", null);
        setField(term288112, term288112.getClass(), "extStr2", null);
        setLongField(term288112, term288112.getClass(), "extLong1", 0L);
        setLongField(term288112, term288112.getClass(), "extLong2", 0L);
        setField(term288112, term288112.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term288112, term288112.getClass(), "isNetBattleHost", false);
        setIntField(term288112, term288112.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlaceName", argTypes, term288112, args);
    }

};


