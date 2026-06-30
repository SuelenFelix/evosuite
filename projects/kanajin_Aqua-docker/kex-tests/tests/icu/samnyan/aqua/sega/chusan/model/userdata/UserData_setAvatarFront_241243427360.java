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

public class UserData_setAvatarFront_241243427360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289360;
     Object term289437;

    public UserData_setAvatarFront_241243427360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289360 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term289360, term289360.getClass(), "id", 0L);
        setField(term289360, term289360.getClass(), "card", null);
        setField(term289360, term289360.getClass(), "userName", null);
        setIntField(term289360, term289360.getClass(), "level", 0);
        setIntField(term289360, term289360.getClass(), "reincarnationNum", 0);
        setField(term289360, term289360.getClass(), "exp", null);
        setLongField(term289360, term289360.getClass(), "point", 0L);
        setLongField(term289360, term289360.getClass(), "totalPoint", 0L);
        setIntField(term289360, term289360.getClass(), "playCount", 0);
        setIntField(term289360, term289360.getClass(), "multiPlayCount", 0);
        setIntField(term289360, term289360.getClass(), "playerRating", 0);
        setIntField(term289360, term289360.getClass(), "highestRating", 0);
        setIntField(term289360, term289360.getClass(), "nameplateId", 0);
        setIntField(term289360, term289360.getClass(), "frameId", 0);
        setIntField(term289360, term289360.getClass(), "characterId", 0);
        setIntField(term289360, term289360.getClass(), "trophyId", 0);
        setIntField(term289360, term289360.getClass(), "playedTutorialBit", 0);
        setIntField(term289360, term289360.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term289360, term289360.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term289360, term289360.getClass(), "totalMapNum", 0);
        setLongField(term289360, term289360.getClass(), "totalHiScore", 0L);
        setLongField(term289360, term289360.getClass(), "totalBasicHighScore", 0L);
        setLongField(term289360, term289360.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term289360, term289360.getClass(), "totalExpertHighScore", 0L);
        setLongField(term289360, term289360.getClass(), "totalMasterHighScore", 0L);
        setLongField(term289360, term289360.getClass(), "totalUltimaHighScore", 0L);
        setField(term289360, term289360.getClass(), "eventWatchedDate", null);
        setIntField(term289360, term289360.getClass(), "friendCount", 0);
        setField(term289360, term289360.getClass(), "firstGameId", null);
        setField(term289360, term289360.getClass(), "firstRomVersion", null);
        setField(term289360, term289360.getClass(), "firstDataVersion", null);
        setField(term289360, term289360.getClass(), "firstPlayDate", null);
        setField(term289360, term289360.getClass(), "lastGameId", null);
        setField(term289360, term289360.getClass(), "lastRomVersion", null);
        setField(term289360, term289360.getClass(), "lastDataVersion", null);
        setField(term289360, term289360.getClass(), "lastLoginDate", null);
        setField(term289360, term289360.getClass(), "lastPlayDate", null);
        setIntField(term289360, term289360.getClass(), "lastPlaceId", 0);
        setField(term289360, term289360.getClass(), "lastPlaceName", null);
        setField(term289360, term289360.getClass(), "lastRegionId", null);
        setField(term289360, term289360.getClass(), "lastRegionName", null);
        setField(term289360, term289360.getClass(), "lastAllNetId", null);
        setField(term289360, term289360.getClass(), "lastClientId", null);
        setField(term289360, term289360.getClass(), "lastCountryCode", null);
        setField(term289360, term289360.getClass(), "userNameEx", null);
        setField(term289360, term289360.getClass(), "compatibleCmVersion", null);
        setIntField(term289360, term289360.getClass(), "medal", 0);
        setIntField(term289360, term289360.getClass(), "mapIconId", 0);
        setIntField(term289360, term289360.getClass(), "voiceId", 0);
        setIntField(term289360, term289360.getClass(), "avatarWear", 0);
        setIntField(term289360, term289360.getClass(), "avatarHead", 0);
        setIntField(term289360, term289360.getClass(), "avatarFace", 0);
        setIntField(term289360, term289360.getClass(), "avatarSkin", 0);
        setIntField(term289360, term289360.getClass(), "avatarItem", 0);
        setIntField(term289360, term289360.getClass(), "avatarFront", 0);
        setIntField(term289360, term289360.getClass(), "avatarBack", 0);
        setIntField(term289360, term289360.getClass(), "classEmblemBase", 0);
        setIntField(term289360, term289360.getClass(), "classEmblemMedal", 0);
        setIntField(term289360, term289360.getClass(), "stockedGridCount", 0);
        setIntField(term289360, term289360.getClass(), "exMapLoopCount", 0);
        setIntField(term289360, term289360.getClass(), "netBattlePlayCount", 0);
        setIntField(term289360, term289360.getClass(), "netBattleWinCount", 0);
        setIntField(term289360, term289360.getClass(), "netBattleLoseCount", 0);
        setIntField(term289360, term289360.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term289360, term289360.getClass(), "charaIllustId", 0);
        setIntField(term289360, term289360.getClass(), "skillId", 0);
        setIntField(term289360, term289360.getClass(), "overPowerPoint", 0);
        setIntField(term289360, term289360.getClass(), "overPowerRate", 0);
        setIntField(term289360, term289360.getClass(), "overPowerLowerRank", 0);
        setIntField(term289360, term289360.getClass(), "avatarPoint", 0);
        setIntField(term289360, term289360.getClass(), "battleRankId", 0);
        setIntField(term289360, term289360.getClass(), "battleRankPoint", 0);
        setIntField(term289360, term289360.getClass(), "eliteRankPoint", 0);
        setIntField(term289360, term289360.getClass(), "netBattle1stCount", 0);
        setIntField(term289360, term289360.getClass(), "netBattle2ndCount", 0);
        setIntField(term289360, term289360.getClass(), "netBattle3rdCount", 0);
        setIntField(term289360, term289360.getClass(), "netBattle4thCount", 0);
        setIntField(term289360, term289360.getClass(), "netBattleCorrection", 0);
        setIntField(term289360, term289360.getClass(), "netBattleErrCnt", 0);
        setIntField(term289360, term289360.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term289360, term289360.getClass(), "battleRewardStatus", 0);
        setIntField(term289360, term289360.getClass(), "battleRewardIndex", 0);
        setIntField(term289360, term289360.getClass(), "battleRewardCount", 0);
        setIntField(term289360, term289360.getClass(), "ext1", 0);
        setIntField(term289360, term289360.getClass(), "ext2", 0);
        setIntField(term289360, term289360.getClass(), "ext3", 0);
        setIntField(term289360, term289360.getClass(), "ext4", 0);
        setIntField(term289360, term289360.getClass(), "ext5", 0);
        setIntField(term289360, term289360.getClass(), "ext6", 0);
        setIntField(term289360, term289360.getClass(), "ext7", 0);
        setIntField(term289360, term289360.getClass(), "ext8", 0);
        setIntField(term289360, term289360.getClass(), "ext9", 0);
        setIntField(term289360, term289360.getClass(), "ext10", 0);
        setField(term289360, term289360.getClass(), "extStr1", null);
        setField(term289360, term289360.getClass(), "extStr2", null);
        setLongField(term289360, term289360.getClass(), "extLong1", 0L);
        setLongField(term289360, term289360.getClass(), "extLong2", 0L);
        setField(term289360, term289360.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term289360, term289360.getClass(), "isNetBattleHost", false);
        setIntField(term289360, term289360.getClass(), "netBattleEndState", 0);
        term289437 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289437;
        callMethod(klass, "setAvatarFront", argTypes, term289360, args);
    }

};


