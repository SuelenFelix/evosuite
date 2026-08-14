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

public class UserData_getAvatarSkin_332184133259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4216041;

    public UserData_getAvatarSkin_332184133259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4216041 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4216041, term4216041.getClass(), "id", 0L);
        setField(term4216041, term4216041.getClass(), "card", null);
        setField(term4216041, term4216041.getClass(), "userName", null);
        setIntField(term4216041, term4216041.getClass(), "level", 0);
        setIntField(term4216041, term4216041.getClass(), "reincarnationNum", 0);
        setField(term4216041, term4216041.getClass(), "exp", null);
        setLongField(term4216041, term4216041.getClass(), "point", 0L);
        setLongField(term4216041, term4216041.getClass(), "totalPoint", 0L);
        setIntField(term4216041, term4216041.getClass(), "playCount", 0);
        setIntField(term4216041, term4216041.getClass(), "multiPlayCount", 0);
        setIntField(term4216041, term4216041.getClass(), "playerRating", 0);
        setIntField(term4216041, term4216041.getClass(), "highestRating", 0);
        setIntField(term4216041, term4216041.getClass(), "nameplateId", 0);
        setIntField(term4216041, term4216041.getClass(), "frameId", 0);
        setIntField(term4216041, term4216041.getClass(), "characterId", 0);
        setIntField(term4216041, term4216041.getClass(), "trophyId", 0);
        setIntField(term4216041, term4216041.getClass(), "playedTutorialBit", 0);
        setIntField(term4216041, term4216041.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4216041, term4216041.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4216041, term4216041.getClass(), "totalMapNum", 0);
        setLongField(term4216041, term4216041.getClass(), "totalHiScore", 0L);
        setLongField(term4216041, term4216041.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4216041, term4216041.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4216041, term4216041.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4216041, term4216041.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4216041, term4216041.getClass(), "totalUltimaHighScore", 0L);
        setField(term4216041, term4216041.getClass(), "eventWatchedDate", null);
        setIntField(term4216041, term4216041.getClass(), "friendCount", 0);
        setField(term4216041, term4216041.getClass(), "firstGameId", null);
        setField(term4216041, term4216041.getClass(), "firstRomVersion", null);
        setField(term4216041, term4216041.getClass(), "firstDataVersion", null);
        setField(term4216041, term4216041.getClass(), "firstPlayDate", null);
        setField(term4216041, term4216041.getClass(), "lastGameId", null);
        setField(term4216041, term4216041.getClass(), "lastRomVersion", null);
        setField(term4216041, term4216041.getClass(), "lastDataVersion", null);
        setField(term4216041, term4216041.getClass(), "lastLoginDate", null);
        setField(term4216041, term4216041.getClass(), "lastPlayDate", null);
        setIntField(term4216041, term4216041.getClass(), "lastPlaceId", 0);
        setField(term4216041, term4216041.getClass(), "lastPlaceName", null);
        setField(term4216041, term4216041.getClass(), "lastRegionId", null);
        setField(term4216041, term4216041.getClass(), "lastRegionName", null);
        setField(term4216041, term4216041.getClass(), "lastAllNetId", null);
        setField(term4216041, term4216041.getClass(), "lastClientId", null);
        setField(term4216041, term4216041.getClass(), "lastCountryCode", null);
        setField(term4216041, term4216041.getClass(), "userNameEx", null);
        setField(term4216041, term4216041.getClass(), "compatibleCmVersion", null);
        setIntField(term4216041, term4216041.getClass(), "medal", 0);
        setIntField(term4216041, term4216041.getClass(), "mapIconId", 0);
        setIntField(term4216041, term4216041.getClass(), "voiceId", 0);
        setIntField(term4216041, term4216041.getClass(), "avatarWear", 0);
        setIntField(term4216041, term4216041.getClass(), "avatarHead", 0);
        setIntField(term4216041, term4216041.getClass(), "avatarFace", 0);
        setIntField(term4216041, term4216041.getClass(), "avatarSkin", 0);
        setIntField(term4216041, term4216041.getClass(), "avatarItem", 0);
        setIntField(term4216041, term4216041.getClass(), "avatarFront", 0);
        setIntField(term4216041, term4216041.getClass(), "avatarBack", 0);
        setIntField(term4216041, term4216041.getClass(), "classEmblemBase", 0);
        setIntField(term4216041, term4216041.getClass(), "classEmblemMedal", 0);
        setIntField(term4216041, term4216041.getClass(), "stockedGridCount", 0);
        setIntField(term4216041, term4216041.getClass(), "exMapLoopCount", 0);
        setIntField(term4216041, term4216041.getClass(), "netBattlePlayCount", 0);
        setIntField(term4216041, term4216041.getClass(), "netBattleWinCount", 0);
        setIntField(term4216041, term4216041.getClass(), "netBattleLoseCount", 0);
        setIntField(term4216041, term4216041.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4216041, term4216041.getClass(), "charaIllustId", 0);
        setIntField(term4216041, term4216041.getClass(), "skillId", 0);
        setIntField(term4216041, term4216041.getClass(), "overPowerPoint", 0);
        setIntField(term4216041, term4216041.getClass(), "overPowerRate", 0);
        setIntField(term4216041, term4216041.getClass(), "overPowerLowerRank", 0);
        setIntField(term4216041, term4216041.getClass(), "avatarPoint", 0);
        setIntField(term4216041, term4216041.getClass(), "battleRankId", 0);
        setIntField(term4216041, term4216041.getClass(), "battleRankPoint", 0);
        setIntField(term4216041, term4216041.getClass(), "eliteRankPoint", 0);
        setIntField(term4216041, term4216041.getClass(), "netBattle1stCount", 0);
        setIntField(term4216041, term4216041.getClass(), "netBattle2ndCount", 0);
        setIntField(term4216041, term4216041.getClass(), "netBattle3rdCount", 0);
        setIntField(term4216041, term4216041.getClass(), "netBattle4thCount", 0);
        setIntField(term4216041, term4216041.getClass(), "netBattleCorrection", 0);
        setIntField(term4216041, term4216041.getClass(), "netBattleErrCnt", 0);
        setIntField(term4216041, term4216041.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4216041, term4216041.getClass(), "battleRewardStatus", 0);
        setIntField(term4216041, term4216041.getClass(), "battleRewardIndex", 0);
        setIntField(term4216041, term4216041.getClass(), "battleRewardCount", 0);
        setIntField(term4216041, term4216041.getClass(), "ext1", 0);
        setIntField(term4216041, term4216041.getClass(), "ext2", 0);
        setIntField(term4216041, term4216041.getClass(), "ext3", 0);
        setIntField(term4216041, term4216041.getClass(), "ext4", 0);
        setIntField(term4216041, term4216041.getClass(), "ext5", 0);
        setIntField(term4216041, term4216041.getClass(), "ext6", 0);
        setIntField(term4216041, term4216041.getClass(), "ext7", 0);
        setIntField(term4216041, term4216041.getClass(), "ext8", 0);
        setIntField(term4216041, term4216041.getClass(), "ext9", 0);
        setIntField(term4216041, term4216041.getClass(), "ext10", 0);
        setField(term4216041, term4216041.getClass(), "extStr1", null);
        setField(term4216041, term4216041.getClass(), "extStr2", null);
        setLongField(term4216041, term4216041.getClass(), "extLong1", 0L);
        setLongField(term4216041, term4216041.getClass(), "extLong2", 0L);
        setField(term4216041, term4216041.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4216041, term4216041.getClass(), "isNetBattleHost", false);
        setIntField(term4216041, term4216041.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarSkin", argTypes, term4216041, args);
    }

};


