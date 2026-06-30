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

public class UserData_getPlayedTutorialBit_1705327457222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278668;

    public UserData_getPlayedTutorialBit_1705327457222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278668 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term278668, term278668.getClass(), "id", 0L);
        setField(term278668, term278668.getClass(), "card", null);
        setField(term278668, term278668.getClass(), "userName", null);
        setIntField(term278668, term278668.getClass(), "level", 0);
        setIntField(term278668, term278668.getClass(), "reincarnationNum", 0);
        setField(term278668, term278668.getClass(), "exp", null);
        setLongField(term278668, term278668.getClass(), "point", 0L);
        setLongField(term278668, term278668.getClass(), "totalPoint", 0L);
        setIntField(term278668, term278668.getClass(), "playCount", 0);
        setIntField(term278668, term278668.getClass(), "multiPlayCount", 0);
        setIntField(term278668, term278668.getClass(), "playerRating", 0);
        setIntField(term278668, term278668.getClass(), "highestRating", 0);
        setIntField(term278668, term278668.getClass(), "nameplateId", 0);
        setIntField(term278668, term278668.getClass(), "frameId", 0);
        setIntField(term278668, term278668.getClass(), "characterId", 0);
        setIntField(term278668, term278668.getClass(), "trophyId", 0);
        setIntField(term278668, term278668.getClass(), "playedTutorialBit", 0);
        setIntField(term278668, term278668.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term278668, term278668.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term278668, term278668.getClass(), "totalMapNum", 0);
        setLongField(term278668, term278668.getClass(), "totalHiScore", 0L);
        setLongField(term278668, term278668.getClass(), "totalBasicHighScore", 0L);
        setLongField(term278668, term278668.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term278668, term278668.getClass(), "totalExpertHighScore", 0L);
        setLongField(term278668, term278668.getClass(), "totalMasterHighScore", 0L);
        setLongField(term278668, term278668.getClass(), "totalUltimaHighScore", 0L);
        setField(term278668, term278668.getClass(), "eventWatchedDate", null);
        setIntField(term278668, term278668.getClass(), "friendCount", 0);
        setField(term278668, term278668.getClass(), "firstGameId", null);
        setField(term278668, term278668.getClass(), "firstRomVersion", null);
        setField(term278668, term278668.getClass(), "firstDataVersion", null);
        setField(term278668, term278668.getClass(), "firstPlayDate", null);
        setField(term278668, term278668.getClass(), "lastGameId", null);
        setField(term278668, term278668.getClass(), "lastRomVersion", null);
        setField(term278668, term278668.getClass(), "lastDataVersion", null);
        setField(term278668, term278668.getClass(), "lastLoginDate", null);
        setField(term278668, term278668.getClass(), "lastPlayDate", null);
        setIntField(term278668, term278668.getClass(), "lastPlaceId", 0);
        setField(term278668, term278668.getClass(), "lastPlaceName", null);
        setField(term278668, term278668.getClass(), "lastRegionId", null);
        setField(term278668, term278668.getClass(), "lastRegionName", null);
        setField(term278668, term278668.getClass(), "lastAllNetId", null);
        setField(term278668, term278668.getClass(), "lastClientId", null);
        setField(term278668, term278668.getClass(), "lastCountryCode", null);
        setField(term278668, term278668.getClass(), "userNameEx", null);
        setField(term278668, term278668.getClass(), "compatibleCmVersion", null);
        setIntField(term278668, term278668.getClass(), "medal", 0);
        setIntField(term278668, term278668.getClass(), "mapIconId", 0);
        setIntField(term278668, term278668.getClass(), "voiceId", 0);
        setIntField(term278668, term278668.getClass(), "avatarWear", 0);
        setIntField(term278668, term278668.getClass(), "avatarHead", 0);
        setIntField(term278668, term278668.getClass(), "avatarFace", 0);
        setIntField(term278668, term278668.getClass(), "avatarSkin", 0);
        setIntField(term278668, term278668.getClass(), "avatarItem", 0);
        setIntField(term278668, term278668.getClass(), "avatarFront", 0);
        setIntField(term278668, term278668.getClass(), "avatarBack", 0);
        setIntField(term278668, term278668.getClass(), "classEmblemBase", 0);
        setIntField(term278668, term278668.getClass(), "classEmblemMedal", 0);
        setIntField(term278668, term278668.getClass(), "stockedGridCount", 0);
        setIntField(term278668, term278668.getClass(), "exMapLoopCount", 0);
        setIntField(term278668, term278668.getClass(), "netBattlePlayCount", 0);
        setIntField(term278668, term278668.getClass(), "netBattleWinCount", 0);
        setIntField(term278668, term278668.getClass(), "netBattleLoseCount", 0);
        setIntField(term278668, term278668.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term278668, term278668.getClass(), "charaIllustId", 0);
        setIntField(term278668, term278668.getClass(), "skillId", 0);
        setIntField(term278668, term278668.getClass(), "overPowerPoint", 0);
        setIntField(term278668, term278668.getClass(), "overPowerRate", 0);
        setIntField(term278668, term278668.getClass(), "overPowerLowerRank", 0);
        setIntField(term278668, term278668.getClass(), "avatarPoint", 0);
        setIntField(term278668, term278668.getClass(), "battleRankId", 0);
        setIntField(term278668, term278668.getClass(), "battleRankPoint", 0);
        setIntField(term278668, term278668.getClass(), "eliteRankPoint", 0);
        setIntField(term278668, term278668.getClass(), "netBattle1stCount", 0);
        setIntField(term278668, term278668.getClass(), "netBattle2ndCount", 0);
        setIntField(term278668, term278668.getClass(), "netBattle3rdCount", 0);
        setIntField(term278668, term278668.getClass(), "netBattle4thCount", 0);
        setIntField(term278668, term278668.getClass(), "netBattleCorrection", 0);
        setIntField(term278668, term278668.getClass(), "netBattleErrCnt", 0);
        setIntField(term278668, term278668.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term278668, term278668.getClass(), "battleRewardStatus", 0);
        setIntField(term278668, term278668.getClass(), "battleRewardIndex", 0);
        setIntField(term278668, term278668.getClass(), "battleRewardCount", 0);
        setIntField(term278668, term278668.getClass(), "ext1", 0);
        setIntField(term278668, term278668.getClass(), "ext2", 0);
        setIntField(term278668, term278668.getClass(), "ext3", 0);
        setIntField(term278668, term278668.getClass(), "ext4", 0);
        setIntField(term278668, term278668.getClass(), "ext5", 0);
        setIntField(term278668, term278668.getClass(), "ext6", 0);
        setIntField(term278668, term278668.getClass(), "ext7", 0);
        setIntField(term278668, term278668.getClass(), "ext8", 0);
        setIntField(term278668, term278668.getClass(), "ext9", 0);
        setIntField(term278668, term278668.getClass(), "ext10", 0);
        setField(term278668, term278668.getClass(), "extStr1", null);
        setField(term278668, term278668.getClass(), "extStr2", null);
        setLongField(term278668, term278668.getClass(), "extLong1", 0L);
        setLongField(term278668, term278668.getClass(), "extLong2", 0L);
        setField(term278668, term278668.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term278668, term278668.getClass(), "isNetBattleHost", false);
        setIntField(term278668, term278668.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedTutorialBit", argTypes, term278668, args);
    }

};


