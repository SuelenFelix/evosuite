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

public class UserData_getAvatarHead_11474408257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4215887;

    public UserData_getAvatarHead_11474408257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4215887 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4215887, term4215887.getClass(), "id", 0L);
        setField(term4215887, term4215887.getClass(), "card", null);
        setField(term4215887, term4215887.getClass(), "userName", null);
        setIntField(term4215887, term4215887.getClass(), "level", 0);
        setIntField(term4215887, term4215887.getClass(), "reincarnationNum", 0);
        setField(term4215887, term4215887.getClass(), "exp", null);
        setLongField(term4215887, term4215887.getClass(), "point", 0L);
        setLongField(term4215887, term4215887.getClass(), "totalPoint", 0L);
        setIntField(term4215887, term4215887.getClass(), "playCount", 0);
        setIntField(term4215887, term4215887.getClass(), "multiPlayCount", 0);
        setIntField(term4215887, term4215887.getClass(), "playerRating", 0);
        setIntField(term4215887, term4215887.getClass(), "highestRating", 0);
        setIntField(term4215887, term4215887.getClass(), "nameplateId", 0);
        setIntField(term4215887, term4215887.getClass(), "frameId", 0);
        setIntField(term4215887, term4215887.getClass(), "characterId", 0);
        setIntField(term4215887, term4215887.getClass(), "trophyId", 0);
        setIntField(term4215887, term4215887.getClass(), "playedTutorialBit", 0);
        setIntField(term4215887, term4215887.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4215887, term4215887.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4215887, term4215887.getClass(), "totalMapNum", 0);
        setLongField(term4215887, term4215887.getClass(), "totalHiScore", 0L);
        setLongField(term4215887, term4215887.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4215887, term4215887.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4215887, term4215887.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4215887, term4215887.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4215887, term4215887.getClass(), "totalUltimaHighScore", 0L);
        setField(term4215887, term4215887.getClass(), "eventWatchedDate", null);
        setIntField(term4215887, term4215887.getClass(), "friendCount", 0);
        setField(term4215887, term4215887.getClass(), "firstGameId", null);
        setField(term4215887, term4215887.getClass(), "firstRomVersion", null);
        setField(term4215887, term4215887.getClass(), "firstDataVersion", null);
        setField(term4215887, term4215887.getClass(), "firstPlayDate", null);
        setField(term4215887, term4215887.getClass(), "lastGameId", null);
        setField(term4215887, term4215887.getClass(), "lastRomVersion", null);
        setField(term4215887, term4215887.getClass(), "lastDataVersion", null);
        setField(term4215887, term4215887.getClass(), "lastLoginDate", null);
        setField(term4215887, term4215887.getClass(), "lastPlayDate", null);
        setIntField(term4215887, term4215887.getClass(), "lastPlaceId", 0);
        setField(term4215887, term4215887.getClass(), "lastPlaceName", null);
        setField(term4215887, term4215887.getClass(), "lastRegionId", null);
        setField(term4215887, term4215887.getClass(), "lastRegionName", null);
        setField(term4215887, term4215887.getClass(), "lastAllNetId", null);
        setField(term4215887, term4215887.getClass(), "lastClientId", null);
        setField(term4215887, term4215887.getClass(), "lastCountryCode", null);
        setField(term4215887, term4215887.getClass(), "userNameEx", null);
        setField(term4215887, term4215887.getClass(), "compatibleCmVersion", null);
        setIntField(term4215887, term4215887.getClass(), "medal", 0);
        setIntField(term4215887, term4215887.getClass(), "mapIconId", 0);
        setIntField(term4215887, term4215887.getClass(), "voiceId", 0);
        setIntField(term4215887, term4215887.getClass(), "avatarWear", 0);
        setIntField(term4215887, term4215887.getClass(), "avatarHead", 0);
        setIntField(term4215887, term4215887.getClass(), "avatarFace", 0);
        setIntField(term4215887, term4215887.getClass(), "avatarSkin", 0);
        setIntField(term4215887, term4215887.getClass(), "avatarItem", 0);
        setIntField(term4215887, term4215887.getClass(), "avatarFront", 0);
        setIntField(term4215887, term4215887.getClass(), "avatarBack", 0);
        setIntField(term4215887, term4215887.getClass(), "classEmblemBase", 0);
        setIntField(term4215887, term4215887.getClass(), "classEmblemMedal", 0);
        setIntField(term4215887, term4215887.getClass(), "stockedGridCount", 0);
        setIntField(term4215887, term4215887.getClass(), "exMapLoopCount", 0);
        setIntField(term4215887, term4215887.getClass(), "netBattlePlayCount", 0);
        setIntField(term4215887, term4215887.getClass(), "netBattleWinCount", 0);
        setIntField(term4215887, term4215887.getClass(), "netBattleLoseCount", 0);
        setIntField(term4215887, term4215887.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4215887, term4215887.getClass(), "charaIllustId", 0);
        setIntField(term4215887, term4215887.getClass(), "skillId", 0);
        setIntField(term4215887, term4215887.getClass(), "overPowerPoint", 0);
        setIntField(term4215887, term4215887.getClass(), "overPowerRate", 0);
        setIntField(term4215887, term4215887.getClass(), "overPowerLowerRank", 0);
        setIntField(term4215887, term4215887.getClass(), "avatarPoint", 0);
        setIntField(term4215887, term4215887.getClass(), "battleRankId", 0);
        setIntField(term4215887, term4215887.getClass(), "battleRankPoint", 0);
        setIntField(term4215887, term4215887.getClass(), "eliteRankPoint", 0);
        setIntField(term4215887, term4215887.getClass(), "netBattle1stCount", 0);
        setIntField(term4215887, term4215887.getClass(), "netBattle2ndCount", 0);
        setIntField(term4215887, term4215887.getClass(), "netBattle3rdCount", 0);
        setIntField(term4215887, term4215887.getClass(), "netBattle4thCount", 0);
        setIntField(term4215887, term4215887.getClass(), "netBattleCorrection", 0);
        setIntField(term4215887, term4215887.getClass(), "netBattleErrCnt", 0);
        setIntField(term4215887, term4215887.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4215887, term4215887.getClass(), "battleRewardStatus", 0);
        setIntField(term4215887, term4215887.getClass(), "battleRewardIndex", 0);
        setIntField(term4215887, term4215887.getClass(), "battleRewardCount", 0);
        setIntField(term4215887, term4215887.getClass(), "ext1", 0);
        setIntField(term4215887, term4215887.getClass(), "ext2", 0);
        setIntField(term4215887, term4215887.getClass(), "ext3", 0);
        setIntField(term4215887, term4215887.getClass(), "ext4", 0);
        setIntField(term4215887, term4215887.getClass(), "ext5", 0);
        setIntField(term4215887, term4215887.getClass(), "ext6", 0);
        setIntField(term4215887, term4215887.getClass(), "ext7", 0);
        setIntField(term4215887, term4215887.getClass(), "ext8", 0);
        setIntField(term4215887, term4215887.getClass(), "ext9", 0);
        setIntField(term4215887, term4215887.getClass(), "ext10", 0);
        setField(term4215887, term4215887.getClass(), "extStr1", null);
        setField(term4215887, term4215887.getClass(), "extStr2", null);
        setLongField(term4215887, term4215887.getClass(), "extLong1", 0L);
        setLongField(term4215887, term4215887.getClass(), "extLong2", 0L);
        setField(term4215887, term4215887.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4215887, term4215887.getClass(), "isNetBattleHost", false);
        setIntField(term4215887, term4215887.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarHead", argTypes, term4215887, args);
    }

};


