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
import java.lang.Integer;

public class UserData_setFriendCount_132901726333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287261;
     Object term287338;

    public UserData_setFriendCount_132901726333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287261 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term287261, term287261.getClass(), "id", 0L);
        setField(term287261, term287261.getClass(), "card", null);
        setField(term287261, term287261.getClass(), "userName", null);
        setIntField(term287261, term287261.getClass(), "level", 0);
        setIntField(term287261, term287261.getClass(), "reincarnationNum", 0);
        setField(term287261, term287261.getClass(), "exp", null);
        setLongField(term287261, term287261.getClass(), "point", 0L);
        setLongField(term287261, term287261.getClass(), "totalPoint", 0L);
        setIntField(term287261, term287261.getClass(), "playCount", 0);
        setIntField(term287261, term287261.getClass(), "multiPlayCount", 0);
        setIntField(term287261, term287261.getClass(), "playerRating", 0);
        setIntField(term287261, term287261.getClass(), "highestRating", 0);
        setIntField(term287261, term287261.getClass(), "nameplateId", 0);
        setIntField(term287261, term287261.getClass(), "frameId", 0);
        setIntField(term287261, term287261.getClass(), "characterId", 0);
        setIntField(term287261, term287261.getClass(), "trophyId", 0);
        setIntField(term287261, term287261.getClass(), "playedTutorialBit", 0);
        setIntField(term287261, term287261.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term287261, term287261.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term287261, term287261.getClass(), "totalMapNum", 0);
        setLongField(term287261, term287261.getClass(), "totalHiScore", 0L);
        setLongField(term287261, term287261.getClass(), "totalBasicHighScore", 0L);
        setLongField(term287261, term287261.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term287261, term287261.getClass(), "totalExpertHighScore", 0L);
        setLongField(term287261, term287261.getClass(), "totalMasterHighScore", 0L);
        setLongField(term287261, term287261.getClass(), "totalUltimaHighScore", 0L);
        setField(term287261, term287261.getClass(), "eventWatchedDate", null);
        setIntField(term287261, term287261.getClass(), "friendCount", 0);
        setField(term287261, term287261.getClass(), "firstGameId", null);
        setField(term287261, term287261.getClass(), "firstRomVersion", null);
        setField(term287261, term287261.getClass(), "firstDataVersion", null);
        setField(term287261, term287261.getClass(), "firstPlayDate", null);
        setField(term287261, term287261.getClass(), "lastGameId", null);
        setField(term287261, term287261.getClass(), "lastRomVersion", null);
        setField(term287261, term287261.getClass(), "lastDataVersion", null);
        setField(term287261, term287261.getClass(), "lastLoginDate", null);
        setField(term287261, term287261.getClass(), "lastPlayDate", null);
        setIntField(term287261, term287261.getClass(), "lastPlaceId", 0);
        setField(term287261, term287261.getClass(), "lastPlaceName", null);
        setField(term287261, term287261.getClass(), "lastRegionId", null);
        setField(term287261, term287261.getClass(), "lastRegionName", null);
        setField(term287261, term287261.getClass(), "lastAllNetId", null);
        setField(term287261, term287261.getClass(), "lastClientId", null);
        setField(term287261, term287261.getClass(), "lastCountryCode", null);
        setField(term287261, term287261.getClass(), "userNameEx", null);
        setField(term287261, term287261.getClass(), "compatibleCmVersion", null);
        setIntField(term287261, term287261.getClass(), "medal", 0);
        setIntField(term287261, term287261.getClass(), "mapIconId", 0);
        setIntField(term287261, term287261.getClass(), "voiceId", 0);
        setIntField(term287261, term287261.getClass(), "avatarWear", 0);
        setIntField(term287261, term287261.getClass(), "avatarHead", 0);
        setIntField(term287261, term287261.getClass(), "avatarFace", 0);
        setIntField(term287261, term287261.getClass(), "avatarSkin", 0);
        setIntField(term287261, term287261.getClass(), "avatarItem", 0);
        setIntField(term287261, term287261.getClass(), "avatarFront", 0);
        setIntField(term287261, term287261.getClass(), "avatarBack", 0);
        setIntField(term287261, term287261.getClass(), "classEmblemBase", 0);
        setIntField(term287261, term287261.getClass(), "classEmblemMedal", 0);
        setIntField(term287261, term287261.getClass(), "stockedGridCount", 0);
        setIntField(term287261, term287261.getClass(), "exMapLoopCount", 0);
        setIntField(term287261, term287261.getClass(), "netBattlePlayCount", 0);
        setIntField(term287261, term287261.getClass(), "netBattleWinCount", 0);
        setIntField(term287261, term287261.getClass(), "netBattleLoseCount", 0);
        setIntField(term287261, term287261.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term287261, term287261.getClass(), "charaIllustId", 0);
        setIntField(term287261, term287261.getClass(), "skillId", 0);
        setIntField(term287261, term287261.getClass(), "overPowerPoint", 0);
        setIntField(term287261, term287261.getClass(), "overPowerRate", 0);
        setIntField(term287261, term287261.getClass(), "overPowerLowerRank", 0);
        setIntField(term287261, term287261.getClass(), "avatarPoint", 0);
        setIntField(term287261, term287261.getClass(), "battleRankId", 0);
        setIntField(term287261, term287261.getClass(), "battleRankPoint", 0);
        setIntField(term287261, term287261.getClass(), "eliteRankPoint", 0);
        setIntField(term287261, term287261.getClass(), "netBattle1stCount", 0);
        setIntField(term287261, term287261.getClass(), "netBattle2ndCount", 0);
        setIntField(term287261, term287261.getClass(), "netBattle3rdCount", 0);
        setIntField(term287261, term287261.getClass(), "netBattle4thCount", 0);
        setIntField(term287261, term287261.getClass(), "netBattleCorrection", 0);
        setIntField(term287261, term287261.getClass(), "netBattleErrCnt", 0);
        setIntField(term287261, term287261.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term287261, term287261.getClass(), "battleRewardStatus", 0);
        setIntField(term287261, term287261.getClass(), "battleRewardIndex", 0);
        setIntField(term287261, term287261.getClass(), "battleRewardCount", 0);
        setIntField(term287261, term287261.getClass(), "ext1", 0);
        setIntField(term287261, term287261.getClass(), "ext2", 0);
        setIntField(term287261, term287261.getClass(), "ext3", 0);
        setIntField(term287261, term287261.getClass(), "ext4", 0);
        setIntField(term287261, term287261.getClass(), "ext5", 0);
        setIntField(term287261, term287261.getClass(), "ext6", 0);
        setIntField(term287261, term287261.getClass(), "ext7", 0);
        setIntField(term287261, term287261.getClass(), "ext8", 0);
        setIntField(term287261, term287261.getClass(), "ext9", 0);
        setIntField(term287261, term287261.getClass(), "ext10", 0);
        setField(term287261, term287261.getClass(), "extStr1", null);
        setField(term287261, term287261.getClass(), "extStr2", null);
        setLongField(term287261, term287261.getClass(), "extLong1", 0L);
        setLongField(term287261, term287261.getClass(), "extLong2", 0L);
        setField(term287261, term287261.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term287261, term287261.getClass(), "isNetBattleHost", false);
        setIntField(term287261, term287261.getClass(), "netBattleEndState", 0);
        term287338 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term287338;
        callMethod(klass, "setFriendCount", argTypes, term287261, args);
    }

};


