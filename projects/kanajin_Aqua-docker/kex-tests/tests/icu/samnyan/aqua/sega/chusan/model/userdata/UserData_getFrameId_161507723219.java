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

public class UserData_getFrameId_161507723219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278437;

    public UserData_getFrameId_161507723219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278437 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term278437, term278437.getClass(), "id", 0L);
        setField(term278437, term278437.getClass(), "card", null);
        setField(term278437, term278437.getClass(), "userName", null);
        setIntField(term278437, term278437.getClass(), "level", 0);
        setIntField(term278437, term278437.getClass(), "reincarnationNum", 0);
        setField(term278437, term278437.getClass(), "exp", null);
        setLongField(term278437, term278437.getClass(), "point", 0L);
        setLongField(term278437, term278437.getClass(), "totalPoint", 0L);
        setIntField(term278437, term278437.getClass(), "playCount", 0);
        setIntField(term278437, term278437.getClass(), "multiPlayCount", 0);
        setIntField(term278437, term278437.getClass(), "playerRating", 0);
        setIntField(term278437, term278437.getClass(), "highestRating", 0);
        setIntField(term278437, term278437.getClass(), "nameplateId", 0);
        setIntField(term278437, term278437.getClass(), "frameId", 0);
        setIntField(term278437, term278437.getClass(), "characterId", 0);
        setIntField(term278437, term278437.getClass(), "trophyId", 0);
        setIntField(term278437, term278437.getClass(), "playedTutorialBit", 0);
        setIntField(term278437, term278437.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term278437, term278437.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term278437, term278437.getClass(), "totalMapNum", 0);
        setLongField(term278437, term278437.getClass(), "totalHiScore", 0L);
        setLongField(term278437, term278437.getClass(), "totalBasicHighScore", 0L);
        setLongField(term278437, term278437.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term278437, term278437.getClass(), "totalExpertHighScore", 0L);
        setLongField(term278437, term278437.getClass(), "totalMasterHighScore", 0L);
        setLongField(term278437, term278437.getClass(), "totalUltimaHighScore", 0L);
        setField(term278437, term278437.getClass(), "eventWatchedDate", null);
        setIntField(term278437, term278437.getClass(), "friendCount", 0);
        setField(term278437, term278437.getClass(), "firstGameId", null);
        setField(term278437, term278437.getClass(), "firstRomVersion", null);
        setField(term278437, term278437.getClass(), "firstDataVersion", null);
        setField(term278437, term278437.getClass(), "firstPlayDate", null);
        setField(term278437, term278437.getClass(), "lastGameId", null);
        setField(term278437, term278437.getClass(), "lastRomVersion", null);
        setField(term278437, term278437.getClass(), "lastDataVersion", null);
        setField(term278437, term278437.getClass(), "lastLoginDate", null);
        setField(term278437, term278437.getClass(), "lastPlayDate", null);
        setIntField(term278437, term278437.getClass(), "lastPlaceId", 0);
        setField(term278437, term278437.getClass(), "lastPlaceName", null);
        setField(term278437, term278437.getClass(), "lastRegionId", null);
        setField(term278437, term278437.getClass(), "lastRegionName", null);
        setField(term278437, term278437.getClass(), "lastAllNetId", null);
        setField(term278437, term278437.getClass(), "lastClientId", null);
        setField(term278437, term278437.getClass(), "lastCountryCode", null);
        setField(term278437, term278437.getClass(), "userNameEx", null);
        setField(term278437, term278437.getClass(), "compatibleCmVersion", null);
        setIntField(term278437, term278437.getClass(), "medal", 0);
        setIntField(term278437, term278437.getClass(), "mapIconId", 0);
        setIntField(term278437, term278437.getClass(), "voiceId", 0);
        setIntField(term278437, term278437.getClass(), "avatarWear", 0);
        setIntField(term278437, term278437.getClass(), "avatarHead", 0);
        setIntField(term278437, term278437.getClass(), "avatarFace", 0);
        setIntField(term278437, term278437.getClass(), "avatarSkin", 0);
        setIntField(term278437, term278437.getClass(), "avatarItem", 0);
        setIntField(term278437, term278437.getClass(), "avatarFront", 0);
        setIntField(term278437, term278437.getClass(), "avatarBack", 0);
        setIntField(term278437, term278437.getClass(), "classEmblemBase", 0);
        setIntField(term278437, term278437.getClass(), "classEmblemMedal", 0);
        setIntField(term278437, term278437.getClass(), "stockedGridCount", 0);
        setIntField(term278437, term278437.getClass(), "exMapLoopCount", 0);
        setIntField(term278437, term278437.getClass(), "netBattlePlayCount", 0);
        setIntField(term278437, term278437.getClass(), "netBattleWinCount", 0);
        setIntField(term278437, term278437.getClass(), "netBattleLoseCount", 0);
        setIntField(term278437, term278437.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term278437, term278437.getClass(), "charaIllustId", 0);
        setIntField(term278437, term278437.getClass(), "skillId", 0);
        setIntField(term278437, term278437.getClass(), "overPowerPoint", 0);
        setIntField(term278437, term278437.getClass(), "overPowerRate", 0);
        setIntField(term278437, term278437.getClass(), "overPowerLowerRank", 0);
        setIntField(term278437, term278437.getClass(), "avatarPoint", 0);
        setIntField(term278437, term278437.getClass(), "battleRankId", 0);
        setIntField(term278437, term278437.getClass(), "battleRankPoint", 0);
        setIntField(term278437, term278437.getClass(), "eliteRankPoint", 0);
        setIntField(term278437, term278437.getClass(), "netBattle1stCount", 0);
        setIntField(term278437, term278437.getClass(), "netBattle2ndCount", 0);
        setIntField(term278437, term278437.getClass(), "netBattle3rdCount", 0);
        setIntField(term278437, term278437.getClass(), "netBattle4thCount", 0);
        setIntField(term278437, term278437.getClass(), "netBattleCorrection", 0);
        setIntField(term278437, term278437.getClass(), "netBattleErrCnt", 0);
        setIntField(term278437, term278437.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term278437, term278437.getClass(), "battleRewardStatus", 0);
        setIntField(term278437, term278437.getClass(), "battleRewardIndex", 0);
        setIntField(term278437, term278437.getClass(), "battleRewardCount", 0);
        setIntField(term278437, term278437.getClass(), "ext1", 0);
        setIntField(term278437, term278437.getClass(), "ext2", 0);
        setIntField(term278437, term278437.getClass(), "ext3", 0);
        setIntField(term278437, term278437.getClass(), "ext4", 0);
        setIntField(term278437, term278437.getClass(), "ext5", 0);
        setIntField(term278437, term278437.getClass(), "ext6", 0);
        setIntField(term278437, term278437.getClass(), "ext7", 0);
        setIntField(term278437, term278437.getClass(), "ext8", 0);
        setIntField(term278437, term278437.getClass(), "ext9", 0);
        setIntField(term278437, term278437.getClass(), "ext10", 0);
        setField(term278437, term278437.getClass(), "extStr1", null);
        setField(term278437, term278437.getClass(), "extStr2", null);
        setLongField(term278437, term278437.getClass(), "extLong1", 0L);
        setLongField(term278437, term278437.getClass(), "extLong2", 0L);
        setField(term278437, term278437.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term278437, term278437.getClass(), "isNetBattleHost", false);
        setIntField(term278437, term278437.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term278437, args);
    }

};


